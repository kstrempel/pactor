from pactor.vm import VM
from pactor.node_stack_helper import pop, push
from pactor.node_parent import AstNode

class DupNode(AstNode):
  def run(self, vm: VM):
    value = vm.stack.pop()
    vm.stack.append(value)
    vm.stack.append(value)

class SwapNode(AstNode):
  def run(self, vm: VM):
    value1 = vm.stack.pop()
    value2 = vm.stack.pop()
    vm.stack.append(value1)
    vm.stack.append(value2)

class StrNode(AstNode):
  def run(self, vm: VM):
    push(vm, str(pop(vm)))