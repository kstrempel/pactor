from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveWords:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_quote_and_call(self):
    script = """
    10 10 [*] call
    """

    vm = self.__run_script(script)
    assert 100 == vm.stack.pop()

