from pactor.compiler import load_script
from pactor.vm import VM

class TestDictionary:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_dictonary(self):
    script = """
    { "1" 1 "2" 2 "3" 3 "4" 4 "5" 5 }
    """

