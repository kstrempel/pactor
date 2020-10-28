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

  @property
  def first_node(self):
    return self.__nodes[0]

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

class BooleanNode():
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

class CallNode():
  def run(self, vm: VM):
    quote = vm.stack.pop()
    vm.run_ast(quote.ast)

class WhenNode():
  def run(self, vm: VM):
    quote = vm.stack.pop()
    is_true = vm.stack.pop()
    if is_true:
      vm.run_ast(quote.ast)

class IfNode():
  def run(self, vm: VM):
    quote_false = vm.stack.pop()
    quote_true = vm.stack.pop()
    is_true = vm.stack.pop()
    if is_true:
      vm.run_ast(quote_true.ast)
    else:
      vm.run_ast(quote_false.ast)


class TimesNode():
  def run(self, vm: VM):
    quote = vm.stack.pop()
    count = vm.stack.pop()
    for _ in range(0, count):
      vm.run_ast(quote.ast)

class QuoteNode():
  def __init__(self, ast):
    self.__ast = ast

  @property
  def ast(self):
    return self.__ast

  def run(self, vm: VM):
      vm.stack.append(self)

class CallWordNode():
    def __init__(self, word):
      self.__word = word
    def run(self, vm : VM):
      vm.run_word(self.__word)

class WordNode():
    def __init__(self, name, ast, from_stack, to_stack):
      self.__name = name
      self.__ast = ast
      self.__from_stack = from_stack
      self.__to_stack = to_stack

    @property
    def from_stack(self):
      return self.__from_stack

    @property
    def to_stack(self):
      return self.__to_stack

    @property
    def ast(self):
      return self.__ast

    def run(self, vm: VM):
      vm.register_word(self.__name, self)

