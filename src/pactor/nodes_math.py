from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop_value, push
from pactor.nodes_primitives import NumberNode, FloatNode, StringNode


def create_node(value):
  if isinstance(value,str):
    return StringNode(value, None)
  elif isinstance(value, int):
    return NumberNode(value, None)
  elif isinstance(value, float):
    return FloatNode(value, None)

class AddNode(AstNode):
  def run(self, vm: VM):
    value1 = pop_value(vm)
    value2 = pop_value(vm)
    value = create_node(value2 + value1)
    push(vm, value)

class MinusNode(AstNode):
  def run(self, vm: VM):
    value1 = pop_value(vm)
    value2 = pop_value(vm)
    value = create_node(value2 - value1)
    push(vm, value)

class MultiplyNode(AstNode):
  def run(self, vm: VM):
    value = create_node(pop_value(vm) * pop_value(vm))
    push(vm, value)

class DivideNode(AstNode):
  def run(self, vm: VM):
    value1 = pop_value(vm)
    value2 = pop_value(vm)
    value = create_node(value2 / value1)
    push(vm, value)