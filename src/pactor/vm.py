

class VM:

  def __init__(self, ast):
    self.__ast = ast
    self.__stack = []
    self.__words = {}
    self.__symbols = {}

  def run(self):
    for node in self.__ast.nodes:
      node.run(self)

  @property
  def stack(self):
    return self.__stack