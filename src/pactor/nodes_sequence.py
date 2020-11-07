from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop, push, run_node, pop_value

class ArrayNode(AstNode):
  def __init__(self, elements=None, ctx=None):
    super().__init__(ctx)
    self.__elements = elements.nodes if elements else []
  def run(self, vm: VM):
    push(vm, self)
  def append(self, node: AstNode):
    self.__elements.append(node)
  def __repr__(self):
    return '(' + " ".join([str(e) for e in self.__elements]) + ')'
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

class ReduceNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    acc = pop(vm)
    sequence = pop(vm)
    for entry in sequence:
      run_node(vm, entry)
      run_node(vm, acc)
      vm.run_ast(quote.ast)
      acc = pop(vm)
    push(vm, acc)

