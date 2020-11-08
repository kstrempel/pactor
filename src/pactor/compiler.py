import os
from antlr4 import *
from antlr4.error.ErrorListener import ConsoleErrorListener
from pactor.ast import Ast
from pactor.PactorLexer import PactorLexer
from pactor.PactorParser import PactorParser
from pactor.ASTVisitor import ASTVisitor
from pactor.nodes_using import UsingNode
from pactor.nodes_blocks import WordNode
from pactor.error_listener import PactorErrorListener


def load_script(script):
    stream = InputStream(script)
    return __build_ast(stream)

def load_file(file):
    stream = FileStream(file)
    return __build_ast(stream, file)

def __build_ast(inputstream : InputStream, module = None):
    lexer = PactorLexer(inputstream)
    stream = CommonTokenStream(lexer)
    parser = PactorParser(stream)
    parser.removeErrorListener(ConsoleErrorListener.INSTANCE)
    parser.addErrorListener(PactorErrorListener("repl" if not module else module))
    tree = parser.program()
    visitor = ASTVisitor()
    visitor.visit(tree)

    for node in visitor.ast.nodes:
        if isinstance(node, UsingNode):
            frameworkpath = os.path.join('framework', node.package+'.pactor')
            stream = FileStream(frameworkpath)
            ast = __build_ast(stream, frameworkpath)
            for node in ast.nodes:
                if isinstance(node, WordNode):
                    # add importet words to begin of ast
                    visitor.ast.add_node_beginning(node)
    return visitor.ast
