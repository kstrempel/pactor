from pactor.compiler import load_script
from pactor.vm import VM
from pactor.runtime_exceptions import PactorRuntimeError

class TestRuntimeErrors:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_using_str_package(self):
    script = """
    10 *
    """
    try:
      vm = self.__run_script(script)
    except PactorRuntimeError as e:
      assert e.message == "pop from empty stack"


