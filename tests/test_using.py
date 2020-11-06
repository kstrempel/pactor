from pactor.compiler import load_script
from pactor.vm import VM

class TestUsing:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_using_str_package(self):
    script = """
    USING: str kernel;

    "olleH" reverse_string
    """

    vm = self.__run_script(script)
    assert "Hello" == vm.stack.pop().value

