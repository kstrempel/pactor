from pactor.compiler import load_script
from pactor.vm import VM

class TestSequences:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm.stack

  def test_map(self):
    script = """
    (1 2 3 4 5 6 7) [1 +] map seq2stack
    """
    stack = self.__run_script(script)
    assert stack.pop().value == 8
    assert stack.pop().value == 7
    assert stack.pop().value == 6
    assert stack.pop().value == 5
    assert stack.pop().value == 4
    assert stack.pop().value == 3
    assert stack.pop().value == 2
    assert len(stack) == 0

  def test_filter(self):
    script = """
    (1 2 3 4 5 6 7) [4 >] filter seq2stack
    """
    stack = self.__run_script(script)
    assert stack.pop().value == 7
    assert stack.pop().value == 6
    assert stack.pop().value == 5
    assert len(stack) == 0

  def test_reduce_like(self):
    script = """
    0 (1 2 3 4 5 6 7) [ + ] reduce seq2stack
    """
    stack = self.__run_script(script)
    assert stack.pop().value == 28
    assert len(stack) == 0