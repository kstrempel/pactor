from pactor.vm import VM
from pactor.node_stack_helper import two_pop, push, pop

class BooleanNode():
  def __init__(self, value):
    self.__value = value
  def run(self, vm: VM):
      vm.stack.append(self.__value)

class EqualNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 == value1)

class GreaterThanNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 > value1)

class SmallerThanNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 < value1)

class GreaterEqualThanNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 >= value1)

class SmallerEqualThanNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value2 <= value1)

class NoEqualNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value1 != value2)

class NotNode:
  def run(self, vm: VM):
    value = pop(vm)
    push(vm, not value)

class AndNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value1 and value2)

class OrNode:
  def run(self, vm: VM):
    value1, value2 = two_pop(vm)
    push(vm, value1 or value2)

