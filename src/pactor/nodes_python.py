from importlib import import_module

from pactor.vm import VM
from pactor.node_stack_helper import pop, push
from pactor.node_parent import AstNode


class PythonNode(AstNode):
  def run(self, vm: VM):
    python_code = vm.stack.pop()
    result = eval(python_code)
    vm.stack.append(result)

class PyGetattrNode(AstNode):
  def run(self, vm: VM):
    key = vm.stack.pop()
    python_module = vm.stack.pop()
    result = getattr(python_module, key)
    vm.stack.append(result)

class PyModuleNode(AstNode):
  def run(self, vm: VM):
    module_name = vm.stack.pop()
    result = import_module(module_name)
    vm.stack.append(result)

class PyCallNode(AstNode):
  def run(self, vm: VM):
    parameters = []
    python_function = vm.stack.pop()
    count_of_parameters = vm.stack.pop()
    for _ in range(0,count_of_parameters):
      parameters.append(vm.stack.pop())
    parameters = parameters[::-1]
    result = python_function(*parameters)
    vm.stack.append(result)