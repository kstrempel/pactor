from pactor.compiler import load_script
from pactor.vm import VM
from pactor.runtime_exceptions import PactorRuntimeError, PactorUnknownWordOrVariable

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

  def test_unknown_word(self):
    script = """
    10 unknown
    """
    try:
      vm = self.__run_script(script)
    except PactorUnknownWordOrVariable as e:
      assert e.message == "Unknown word or variable: unknown"

  def test_unknown_variable(self):
    script = """
    : hello ( a  b -- y ) -> (a,b) c * 10;
    10 10 hello
    """
    try:
      vm = self.__run_script(script)
    except PactorUnknownWordOrVariable as e:
      assert e.message == "Unknown word or variable: c"

  def test_unknown_var_word(self):
    script = """
    :: hello ( a  b -- y ) c * 10;
    10 10 hello
    """
    try:
      vm = self.__run_script(script)
    except PactorUnknownWordOrVariable as e:
      assert e.message == "Unknown word or variable: c"

  def test_divison_zero(self):
    script = """
    10 0 /
    """
    try:
      vm = self.__run_script(script)
    except PactorRuntimeError as e:
      assert e.message == "division by zero"

