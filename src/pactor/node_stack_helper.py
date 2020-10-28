from pactor.vm import VM

def pop(vm: VM):
  return vm.stack.pop()

def two_pop(vm: VM):
  return vm.stack.pop(), vm.stack.pop()

def push(vm: VM, value):
  vm.stack.append(value)