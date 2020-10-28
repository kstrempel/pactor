from antlr4 import *
from pactor.ast import Ast
from pactor.PactorLexer import PactorLexer
from pactor.PactorParser import PactorParser
from pactor.ASTVisitor import ASTVisitor

def load_script(script):
    stream = InputStream(script)
    return __build_ast(stream)

def __build_ast(inputstream : InputStream):
  lexer = PactorLexer(inputstream)
  stream = CommonTokenStream(lexer)
  parser = PactorParser(stream)
  tree = parser.program()
  visitor = ASTVisitor()
  visitor.visit(tree)
  return visitor.ast
