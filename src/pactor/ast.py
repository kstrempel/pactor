from abc import ABC, abstractmethod
from pactor.vm import VM

class Node(ABC):

  @abstractmethod
  def run(self, stack):
    pass

class Ast:
  def __init__(self):
    self.__nodes = []

  def add_node(self, node: Node):
    self.__nodes.append(node)

  @property
  def nodes(self):
    return self.__nodes

class NumberNode():
  def __init__(self, value):
    self.__value = int(value)
  def run(self, vm: VM):
      vm.stack.append(self.__value)

class FloatNode():
  def __init__(self, value):
    self.__value = float(value)
  def run(self, vm: VM):
      vm.stack.append(self.__value)

class StringNode():
  def __init__(self, value):
    self.__value = value
  def run(self, vm: VM):
      vm.stack.append(self.__value)

class AddNode():
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    value = value2 + value1
    vm.stack.append(value)

class MinusNode():
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    vm.stack.append(value2 - value1)

class TimesNode():
  def run(self, vm: VM):
    value = vm.stack.pop() * vm.stack.pop()
    vm.stack.append(value)

class DivideNode():
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    value = value2 / value1
    vm.stack.append(value)

class DupNode():
  def run(self, vm: VM):
    value = vm.stack.pop()
    vm.stack.append(value)
    vm.stack.append(value)

class SwapNode():
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    vm.stack.append(value1)
    vm.stack.append(value2)



