from pactor.vm import VM
from pactor.node_stack_helper import two_pop_value, push, pop_value
from pactor.node_parent import AstNode

class BooleanNode(AstNode):
  def __init__(self, value, ctx):
    super().__init__(ctx)
    self.__value = value
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return str(self.value)
  @property
  def value(self):
    return self.__value

class EqualNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 == value1, None))

class GreaterThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 > value1, None))

class SmallerThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 < value1, None))

class GreaterEqualThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 >= value1, None))

class SmallerEqualThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 <= value1, None))

class NoEqualNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value1 != value2, None))

class NotNode(AstNode):
  def run(self, vm: VM):
    value = pop_value(vm)
    push(vm, BooleanNode(not value, None))

class AndNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value1 and value2, None))

class OrNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value1 or value2, None))

