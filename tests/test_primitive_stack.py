from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveStack:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm.stack

  def test_add_number(self):
      stack = self.__run_script("10 20")

      assert stack.pop() == 20
      assert stack.pop() == 10

  def test_add_float(self):
      stack = self.__run_script("10.1 20.5")

      assert stack.pop() == 20.5
      assert stack.pop() == 10.1

  def test_add_string(self):
      stack = self.__run_script('"hello" "hallo"')

      assert stack.pop() == "hallo"
      assert stack.pop() == "hello"