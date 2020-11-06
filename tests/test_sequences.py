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
    (1 2 3 4 5 6 7) [1 +] map seq2stack
    """
    stack = self.__run_script(script)
    assert stack.pop() == 8
    assert stack.pop() == 7
    assert stack.pop() == 6
    assert stack.pop() == 5
    assert stack.pop() == 4
    assert stack.pop() == 3
    assert stack.pop() == 2
    assert len(stack) == 0

  # def test_filter(self):
  #   script = """
  #   (1 2 3 4 5 6 7) [4 >] filter seq2stack
  #   """
  #   stack = self.__run_script(script)
  #   assert stack.pop() == 7
  #   assert stack.pop() == 6
  #   assert stack.pop() == 5
  #   assert len(stack) == 0

  def test_reduce_like(self):
    script = """
    0 (1 2 3 4 5 6 7) [ + ] map seq2stack
    """
    stack = self.__run_script(script)
    assert stack.pop() == 28
    assert len(stack) == 0