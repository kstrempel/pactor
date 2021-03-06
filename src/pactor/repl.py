from prompt_toolkit import PromptSession
from prompt_toolkit.formatted_text import HTML
from prompt_toolkit.key_binding import KeyBindings
from prompt_toolkit.history import InMemoryHistory
from prompt_toolkit.auto_suggest import AutoSuggestFromHistory
from prompt_toolkit.completion import WordCompleter
from prompt_toolkit.history import FileHistory

from pactor.vm import VM
from pactor.ast import Ast
from pactor.compiler import load_script
from pactor.nodes_blocks import WordNode
from pactor.runtime_exceptions import InnerPactorRuntimeError
from pactor.nodes_symbol import SYMBOLS
from pactor.error_listener import SyntaxException

file_history = FileHistory('.pactor_history')

bindings = KeyBindings()

@bindings.add('c-d')
def _(event):
  exit(0)

pactor_completer = WordCompleter(['dup', 'str', 'swap', 'call', 'python',
                                  'py_call', 'py_module', 'py_getattr',
                                  'if', 'when', 'times', 's>map', 's>reduce', 's>filter',
                                  's>stack', 'd>keys', 'd>update', 'd>contains?', 'd>value',
                                  'd>pop', 'null', 'null?',
                                  '!=', ">=", '<=', 'and', 'or'])

def print_stack(vm: VM):
  print("--- Data stack:")
  for node in vm.stack:
      print(str(node))

def repl():
  session = PromptSession(message=">>> ",
                          key_bindings=bindings,
                          auto_suggest=AutoSuggestFromHistory(),
                          complete_while_typing=True,
                          completer=pactor_completer,
                          history=file_history)
  print(f"Pactor REPL v0.5")
  print(f"Type ? for more information")
  vm = VM(Ast())
  while True:
    try:
        line = session.prompt()
        if line == '?':
            print("REPL Commands:")
            print(" .  - remove from stack")
            print(" .. - reset stack")
            print(" :  - prints all symbols")
        elif line == '.':
          vm.stack.pop()
          print_stack(vm)
        elif line == '..':
          vm.stack.clear()
          print_stack(vm)
        elif line == ':':
          for symbol in SYMBOLS.keys():
            print(':' + symbol)
        else:
          ast = load_script(line)
          vm.run_ast(ast)
          pactor_completer.words = set(list(pactor_completer.words) + list(vm.words.keys()))
          print_stack(vm)
    except InnerPactorRuntimeError as e:
        print("*** " + e.error_arrow)
        print(f"*** Runtime Error: {e.message}")
        print_stack(vm)
    except SyntaxException as e:
        print("*** " + e.error_arrow)
        print(f"*** Syntax Error: {e.message}")
    except Exception as e:
        print(f"Error: {e}")