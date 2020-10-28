from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveWords:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_string_revers(self):
    script = """
    :reverse ( x -- y ) "'" swap + "'[::-1]" + python ;
    "olleh" reverse
    """

    vm = self.__run_script(script)
    assert "hello" == vm.stack.pop()

