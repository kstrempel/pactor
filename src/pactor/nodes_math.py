from pactor.vm import VM
from pactor.node_parent import AstNode

class AddNode(AstNode):
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    value = value2 + value1
    vm.stack.append(value)

class MinusNode(AstNode):
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    vm.stack.append(value2 - value1)

class MultiplyNode(AstNode):
  def run(self, vm: VM):
    value = vm.stack.pop() * vm.stack.pop()
    vm.stack.append(value)

class DivideNode(AstNode):
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    value = value2 / value1
    vm.stack.append(value)