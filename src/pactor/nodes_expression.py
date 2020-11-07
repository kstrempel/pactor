from pactor.vm import VM
from pactor.node_stack_helper import two_pop_value, push, pop_value, pop
from pactor.node_parent import AstNode

class BooleanNode(AstNode):
  def __init__(self, value, ctx):
    super().__init__(ctx)
    self.__value = value
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return 't' if self.__value else 'f'
  @property
  def value(self):
    return self.__value

class NullNode(AstNode):
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return 'null'

class EqualNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 == value1, None))
  def __repr__(self):
    return '='

class GreaterThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 > value1, None))
  def __repr__(self):
    return '>'

class SmallerThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 < value1, None))
  def __repr__(self):
    return '<'

class GreaterEqualThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 >= value1, None))
  def __repr__(self):
    return '>='

class SmallerEqualThanNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value2 <= value1, None))
  def __repr__(self):
    return '<='

class NoEqualNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value1 != value2, None))
  def __repr__(self):
    return '!+'

class NotNode(AstNode):
  def run(self, vm: VM):
    value = pop_value(vm)
    push(vm, BooleanNode(not value, None))
  def __repr__(self):
    return 'not'

class AndNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value1 and value2, None))
  def __repr__(self):
    return 'and'

class OrNode(AstNode):
  def run(self, vm: VM):
    value1, value2 = two_pop_value(vm)
    push(vm, BooleanNode(value1 or value2, None))
  def __repr__(self):
    return 'or'

class IsNullNode(AstNode):
  def run(self, vm: VM):
    value = pop(vm)
    push(vm, BooleanNode(isinstance(value, NullNode), None))
  def __repr__(self):
    return 'null?'
