from pactor.runtime_exceptions import PactorRuntimeError, PactorUnknownWordOrVariable, InnerPactorRuntimeError

class VM:

  def __init__(self, ast):
    self.__ast = ast
    self.__stack = []
    self.__words = {}
    self.__locals = {}

  def create_inner_vm(self, stack_size: int):
    vm = VM(self.__ast)
    vm.__words = self.__words
    vm.__locals = {}

    # pop parameter to inner stack
    for _ in range(0,stack_size):
      vm.stack.append(self.stack.pop())
    vm.__stack = vm.stack[::-1]
    return vm

  def run(self):
    for node in self.__ast.nodes:
      try:
        node.run(self)
      except InnerPactorRuntimeError as e:
        raise e
      except Exception as e:
        raise PactorRuntimeError(e, node)
    return self

  def run_ast(self, ast):
    for node in ast.nodes:
      try:
        node.run(self)
      except InnerPactorRuntimeError as e:
        raise e
      except Exception as e:
        raise PactorRuntimeError(e, node)

  def run_word_or_variable(self, word_var: str, ctx):
    if word_var in self.__words:
      word_node = self.__words[word_var]
      inner_vm = self.create_inner_vm(word_node.from_stack)
      for node in word_node.ast.nodes:
        try:
          node.run(inner_vm)
        except InnerPactorRuntimeError as e:
          raise e
        except Exception as e:
          raise PactorRuntimeError(e, node)
      # pop return values
      for _ in range(0, word_node.to_stack):
        self.stack.append(inner_vm.stack.pop())
    elif word_var in self.__locals:
      self.stack.append(self.__locals[word_var])
    else:
      raise PactorUnknownWordOrVariable(word_var, ctx)

  def register_word(self, word: str, ast):
    self.__words[word] = ast

  def add_local(self, name):
    self.__locals[name] = self.stack.pop()

  @property
  def stack(self):
    return self.__stack

  @property
  def words(self):
    return self.__words

  @property
  def ast(self):
    return self.__ast