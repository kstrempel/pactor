from pactor.vm import VM
from pactor.node_stack_helper import pop, push

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

class PythonNode():
  def run(self, vm: VM):
    python_code = vm.stack.pop()
    result = eval(python_code)
    vm.stack.append(result)

class StrNode():
  def run(self, vm: VM):
    push(vm, str(pop(vm)))