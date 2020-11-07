from uuid import uuid4

from pactor.vm import VM
from pactor.node_parent import AstNode

SYMBOLS = {"default" : uuid4()}

class SymbolNode(AstNode):

  def __init__(self, name, ctx):
    super().__init__(ctx)
    self.__name = name
    if not name in SYMBOLS:
      SYMBOLS[name] = uuid4()
  def run(self, vm: VM):
      vm.stack.append(self)
  def __repr__(self):
    return  ':' + self.__name
  @property
  def value(self):
    return SYMBOLS[self.__name]