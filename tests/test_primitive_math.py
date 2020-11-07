from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveMath:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm.stack

  def test_add_numbers(self):
      stack = self.__run_script("10 20 +")
      assert stack.pop().value == 30

  def test_add_string(self):
      stack = self.__run_script('"a" "bc" +')
      assert stack.pop().value == 'abc'

  def test_minus_numbers(self):
      stack = self.__run_script("10 5 -")
      assert stack.pop().value == 5

  def test_times_numbers(self):
      stack = self.__run_script("5 8 *")
      assert stack.pop().value == 40

  def test_divide_numbers(self):
      stack = self.__run_script("10 20 /")
      assert stack.pop().value == 0.5

  def test_combined_numbers(self):
      stack = self.__run_script("10 20 / 10 + 4 * 2 /")
      assert stack.pop().value == 21.0
