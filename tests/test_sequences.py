from pactor.compiler import load_script
from pactor.vm import VM

class TestSequences:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm.stack

  def test_each(self):
    script = """
    (1 2 3 4 5 6 7) [1 +] each
    """
    stack = self.__run_script(script)
    assert stack.pop() == 8
    assert stack.pop() == 7
    assert stack.pop() == 6
    assert stack.pop() == 5
    assert stack.pop() == 4
    assert stack.pop() == 3
    assert stack.pop() == 2
