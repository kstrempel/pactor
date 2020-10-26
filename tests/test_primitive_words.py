from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveWords:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm.stack

  def test_dup_stack(self):
      stack = self.__run_script("10 dup")
      assert stack.pop() == 10
      assert stack.pop() == 10

  def test_word_combined_stack(self):
      stack = self.__run_script("10 dup *")
      assert stack.pop() == 100