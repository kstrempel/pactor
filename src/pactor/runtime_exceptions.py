
class InnerPactorRuntimeError(Exception):
  def __init__(self, node):
    self.__node = node

  @property
  def error_arrow(self):
    arrow = ""
    if self.__node:
      line, column = self.__node.line, self.__node.column
      arrow = "=" * column + "^"

    return arrow

  @property
  def line(self):
    if self.__node:
      return self.__node.line

  @property
  def column(self):
    if self.__node:
      return self.__node.column

class PactorRuntimeError(InnerPactorRuntimeError):
  def __init__(self, exception, node):
    super().__init__(node)
    self.__exception = exception

  @property
  def message(self):
    if isinstance(self.__exception, IndexError):
      return "pop from empty stack"
    else:
      return str(self.__exception)

class PactorUnknownWordOrVariable(InnerPactorRuntimeError):
  def __init__(self, word_var, node):
    super().__init__(node)
    self.__word_var = word_var
    self.__node = node

  @property
  def message(self):
    return f"Unknown word of variable: {self.__word_var}"
