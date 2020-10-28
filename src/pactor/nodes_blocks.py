from pactor.vm import VM

class QuoteNode():
  def __init__(self, ast):
    self.__ast = ast

  @property
  def ast(self):
    return self.__ast

  def run(self, vm: VM):
      vm.stack.append(self)

class CallWordNode():
    def __init__(self, word):
      self.__word = word
    def run(self, vm : VM):
      vm.run_word(self.__word)

class WordNode():
    def __init__(self, name, ast, from_stack, to_stack):
      self.__name = name
      self.__ast = ast
      self.__from_stack = from_stack
      self.__to_stack = to_stack

    @property
    def from_stack(self):
      return self.__from_stack

    @property
    def to_stack(self):
      return self.__to_stack

    @property
    def ast(self):
      return self.__ast

    def run(self, vm: VM):
      vm.register_word(self.__name, self)

class CallNode():
  def run(self, vm: VM):
    quote = vm.stack.pop()
    vm.run_ast(quote.ast)
