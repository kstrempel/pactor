class PactorRuntimeError(Exception):
  def __init__(self, exception, node=None):
    self.__exception = exception
    self.__node = node

  @property
  def error_arrow(self):
    arrow = ""
    if self.__node:
      line, column = self.__node.line, self.__node.column
      arrow = "=" * column + "^"

    return arrow

  @property
  def message(self):
    if isinstance(self.__exception, IndexError):
      return "pop from empty stack"
    else:
      return str(self.__exception)

  @property
  def line(self):
    if self.__node:
      return self.__node.line

  @property
  def column(self):
    if self.__node:
      return self.__node.column