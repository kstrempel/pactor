from pactor.vm import VM
from pactor.node_stack_helper import pop, push
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop, push, pop_value
from pactor.nodes_primitives import StringNode

class DupNode(AstNode):
  def run(self, vm: VM):
    value = pop(vm)
    push(vm,value)
    push(vm,value)

class SwapNode(AstNode):
  def run(self, vm: VM):
    value1 = pop(vm)
    value2 = pop(vm)
    push(vm,value1)
    push(vm,value2)

class StrNode(AstNode):
  def run(self, vm: VM):
    push(vm, StringNode(str(pop_value(vm)), None))