from pactor.compiler import load_script
from pactor.vm import VM

class TestQuoteCommands:

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

  def test_quote_and_when(self):
    script = """
    10 t [ 10 * ] when
    """

    vm = self.__run_script(script)
    assert 100 == vm.stack.pop()


  def test_quote_and_times(self):
    script = """
    1 10 [ 2 * ] times
    """

    vm = self.__run_script(script)
    assert 1024 == vm.stack.pop()


