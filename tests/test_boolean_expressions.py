from pactor.compiler import load_script
from pactor.vm import VM

class TestBooleanExpressions:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_boolean_true(self):
    script = "t"

    vm = self.__run_script(script)
    assert True == vm.stack.pop()

  def test_boolean_fasle(self):
    script = "f"

    vm = self.__run_script(script)
    assert False == vm.stack.pop()


