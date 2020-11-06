from importlib import import_module

from pactor.vm import VM
from pactor.node_stack_helper import pop, push, pop_value
from pactor.node_parent import AstNode
from pactor.nodes_math import create_node


class PythonNode(AstNode):
  def run(self, vm: VM):
    python_code = pop_value(vm)
    result = create_node(eval(python_code))
    push(vm, result)

class PyGetattrNode(AstNode):
  def run(self, vm: VM):
    key = pop_value(vm)
    python_module = pop(vm)
    result = getattr(python_module, key)
    push(vm, result)

class PyModuleNode(AstNode):
  def run(self, vm: VM):
    module_name = pop_value(vm)
    result = import_module(module_name)
    push(vm, result)

class PyCallNode(AstNode):
  def run(self, vm: VM):
    parameters = []
    python_function = pop(vm)
    count_of_parameters = pop_value(vm)
    for _ in range(0,count_of_parameters):
      parameters.append(vm.stack.pop().value)
    parameters = parameters[::-1]
    result = python_function(*parameters)
    vm.stack.append(create_node(result))