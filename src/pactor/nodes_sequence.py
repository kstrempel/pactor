from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop, push, run_node, pop_value

class ArrayNode(AstNode):
  def __init__(self, elements=None, ctx=None):
    if ctx:
      super().__init__(ctx)
    if elements:
      self.__elements = elements.nodes
    else:
      self.__elements = []
  def run(self, vm: VM):
    push(vm, self)
  def append(self, node: AstNode):
    self.__elements.append(node)
  def __iter__(self):
    return self.__elements.__iter__()
  def __next__(self):
    return self.__elements.__next__()

class Seq2StackNode(AstNode):
  def run(self, vm: VM):
    sequence = pop(vm)
    for entry in sequence:
      run_node(vm, entry)

class MapNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    sequence = pop(vm)
    result = ArrayNode()
    for entry in sequence:
      run_node(vm, entry)
      vm.run_ast(quote.ast)
      node = pop(vm)
      result.append(node)
    push(vm, result)

class FilterNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    sequence = pop(vm)
    filtered = ArrayNode()
    for entry in sequence:
      run_node(vm, entry)
      vm.run_ast(quote.ast)
      result = pop_value(vm)
      if result:
        filtered.append(entry)
    push(vm,filtered)

