from pactor.vm import VM

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