from pactor.vm import VM
from pactor.node_parent import AstNode

class QuoteNode(AstNode):
  def __init__(self, ast, ctx):
    super().__init__(ctx)
    self.__ast = ast

  @property
  def ast(self):
    return self.__ast

  def run(self, vm: VM):
      vm.stack.append(self)

class CallWordOrVariableNode(AstNode):
    def __init__(self, word, ctx):
      self.__word = word
      super().__init__(ctx)
    def run(self, vm : VM):
      vm.run_word_or_variable(self.__word)

class WordNode(AstNode):
    def __init__(self, name, ast, from_stack, to_stack, ctx):
      super().__init__(ctx)
      self.__name = name
      self.__ast = ast
      self.__from_stack = from_stack
      self.__to_stack = to_stack

    @property
    def name(self):
      return self.__name

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

class CallNode(AstNode):
  def run(self, vm: VM):
    quote = vm.stack.pop()
    vm.run_ast(quote.ast)

class Stack2LocalVarsNode(AstNode):
  def __init__(self, local_vars, ctx):
    super().__init__(ctx)
    self.__local_vars = local_vars
  def run(self, vm: VM):
    for name in self.__local_vars[::-1]:
      vm.add_local(name)