from pactor.compiler import load_script
from pactor.vm import VM

class Helper:
  def run_script(self, script):
    ast = load_script(script)
    vm = VM(ast)
    vm.run()

    return vm