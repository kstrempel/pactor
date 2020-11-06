from pactor.vm import VM

def pop(vm: VM):
  return vm.stack.pop()

def pop_value(vm: VM):
  return vm.stack.pop().value

def two_pop(vm: VM):
  return vm.stack.pop(), vm.stack.pop()

def two_pop_value(vm: VM):
  return vm.stack.pop().value, vm.stack.pop().value

def push(vm: VM, value):
  vm.stack.append(value)

def run_node(vm: VM, node):
  node.run(vm)