from pactor.vm import VM
from pactor.node_parent import AstNode

class NumberNode(AstNode):
  def __init__(self, value, ctx):
    super().__init__(ctx)
    self.__value = int(value)
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return str(self.value) + 'i'
  @property
  def value(self):
    return self.__value

class FloatNode(AstNode):
  def __init__(self, value, ctx):
    super().__init__(ctx)
    self.__value = float(value)
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return str(self.value) + 'f'
  @property
  def value(self):
    return self.__value

class StringNode(AstNode):
  def __init__(self, value, ctx):
    super().__init__(ctx)
    self.__value = value.encode('utf-8').decode('unicode_escape')
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return '"' + str(self.value) + '"'
  @property
  def value(self):
    return self.__value
