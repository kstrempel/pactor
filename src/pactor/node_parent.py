class AstNode:
  def __init__(self, ctx):
    self.__column = int(ctx.start.column)
    self.__line = int(ctx.start.line)

  @property
  def line(self):
    return self.__line

  @property
  def column(self):
    return self.__column