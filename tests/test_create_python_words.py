from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveWords:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_string_revers(self):
    script = """
    :reverse ( x -- y ) "'" swap + "'[::-1]" + python ;
    "olleh" reverse
    """

    vm = self.__run_script(script)
    assert "hello" == vm.stack.pop()

  def test_python_module(self):
    script = """
     "random" py_module
    """

    vm = self.__run_script(script)
    assert getattr(vm.stack.pop(),"randint") != None

  def test_python_module_getattr(self):
    script = """
     "random" py_module "randint" py_getattr
    """

    vm = self.__run_script(script)
    assert vm.stack.pop().__hash__() != None


  def test_python_function_moduls(self):
    script = """
    :random ( min max -- r) 2 "random" py_module "randint" py_getattr py_call;
    10 10 random
    """

    vm = self.__run_script(script)
    assert vm.stack.pop() == 10