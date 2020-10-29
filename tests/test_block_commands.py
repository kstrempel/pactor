from pactor.compiler import load_script
from pactor.vm import VM

class TestBlockCommands:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_using_local_var(self):
    script = """
    10  [ -> a 40 a - ] call
    """

    vm = self.__run_script(script)
    assert 30 == vm.stack.pop()

  def test_using_local_vars(self):
    script = """
    10 40 [ -> (a b) b a - ] call
    """

    vm = self.__run_script(script)
    assert 30 == vm.stack.pop()
