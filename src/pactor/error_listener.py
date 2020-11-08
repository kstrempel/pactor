from antlr4.error.ErrorListener import ErrorListener

class SyntaxException(Exception):
  def __init__(self, line, column, message, module):
    self.line = line
    self.column = column
    self.message = message
    self.module = module
  @property
  def error_arrow(self):
    if self.module == "repl":
      arrow = "=" * self.column + "^"
      return arrow
    return f"Module: {self.module} ({self.line}|{self.column})"


class PactorErrorListener(ErrorListener):
  def __init__(self, module):
      super(PactorErrorListener, self).__init__()
      self.__module = module
  def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
      raise SyntaxException(line, column, msg, self.__module)
  def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
      raise Exception("Oh no!! Ambiguity")
  def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
      raise Exception("Oh no!! FullContext")
  def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
      raise Exception("Oh no!! Context Sensitivity")