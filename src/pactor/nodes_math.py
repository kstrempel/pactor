from pactor.vm import VM

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

class MultiplyNode():
  def run(self, vm: VM):
    value = vm.stack.pop() * vm.stack.pop()
    vm.stack.append(value)

class DivideNode():
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    value = value2 / value1
    vm.stack.append(value)