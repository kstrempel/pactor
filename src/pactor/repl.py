from prompt_toolkit import PromptSession
from prompt_toolkit.formatted_text import HTML
from prompt_toolkit.key_binding import KeyBindings
from prompt_toolkit.history import InMemoryHistory
from prompt_toolkit.auto_suggest import AutoSuggestFromHistory

from pactor.vm import VM
from pactor.ast import Ast
from pactor.compiler import load_script

bindings = KeyBindings()

@bindings.add('c-d')
def _(event):
  exit(0)

def repl():
  session = PromptSession(message=">>> ", key_bindings=bindings, auto_suggest=AutoSuggestFromHistory())
  vm = VM(Ast())
  while True:
    try:
        line = session.prompt()
        ast = load_script(line)
        vm.run_ast(ast)
        print("--- Data stack:")
        for node in vm.stack:
            print(node)
    except Exception as e:
        print(f"Error: {e}")