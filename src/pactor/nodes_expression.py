from pactor.vm import VM
from pactor.node_stack_helper import two_pop, push, pop
from pactor.node_parent import AstNode

class BooleanNode(AstNode):
  def __init__(self, value, ctx):
    super().__init__(ctx)
    self.__value = value
  def run(self, vm: VM):
      vm.stack.append(self.__value)

class EqualNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 == value1)

class GreaterThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 > value1)

class SmallerThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 < value1)

class GreaterEqualThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 >= value1)

class SmallerEqualThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 <= value1)

class NoEqualNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value1 != value2)

class NotNode(AstNode):
  def run(self, vm: VM):
    value = pop(vm)
    push(vm, not value)

class AndNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value1 and value2)

class OrNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value1 or value2)

