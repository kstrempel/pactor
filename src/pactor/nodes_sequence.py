from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop, push, run_node

class ArrayNode(AstNode):
  def __init__(self, elements, ctx):
    super().__init__(ctx)
    self.__elements = elements.nodes
  def run(self, vm: VM):
    push(vm, self)
  def __iter__(self):
    return self.__elements.__iter__()
  def __next__(self):
    return self.__elements.__next__()

class EachNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    sequence = pop(vm)
    for entry in sequence:
      run_node(vm, entry)
      vm.run_ast(quote.ast)

class FilterNode(AstNode):
  def run(self, vm: VM):
    pass

class ReduceNode(AstNode):
  def run(self, vm: VM):
    pass