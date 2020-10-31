from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop, push

class EachNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    sequence = pop(vm)
    for entry in sequence:
      push(vm, entry)
      vm.run_ast(quote.ast)

class FilterNode(AstNode):
  def run(self, vm: VM):
    pass

class ReduceNode(AstNode):
  def run(self, vm: VM):
    pass