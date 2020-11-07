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
    assert True == vm.stack.pop().value

  def test_boolean_false(self):
    script = "f"

    vm = self.__run_script(script)
    assert False == vm.stack.pop().value

  def test_not(self):
    script = "f not"

    vm = self.__run_script(script)
    assert True == vm.stack.pop().value

    script = "t not"

    vm = self.__run_script(script)
    assert False == vm.stack.pop().value

  def test_greater(self):
    script = "1 2 < 2 1 <"

    vm = self.__run_script(script)
    assert False == vm.stack.pop().value
    assert True == vm.stack.pop().value

  def test_smaller(self):
    script = "1 2 > 2 1 >"

    vm = self.__run_script(script)
    assert True == vm.stack.pop().value
    assert False == vm.stack.pop().value

  def test_smaller_equal(self):
    script = "1 2 >= 2 1 >= 2 2 >="

    vm = self.__run_script(script)
    assert True == vm.stack.pop().value
    assert True == vm.stack.pop().value
    assert False == vm.stack.pop().value

  def test_greater_equal(self):
    script = "1 2 <= 2 1 <= 2 2 <="

    vm = self.__run_script(script)
    assert True == vm.stack.pop().value
    assert False == vm.stack.pop().value
    assert True == vm.stack.pop().value

  def test_boolean_and(self):
    script = "t t and t f and f t and f f and"

    vm = self.__run_script(script)
    assert False == vm.stack.pop().value
    assert False == vm.stack.pop().value
    assert False == vm.stack.pop().value
    assert True == vm.stack.pop().value

  def test_boolean_or(self):
    script = "t t or t f or f t or f f or"

    vm = self.__run_script(script)
    assert False == vm.stack.pop().value
    assert True == vm.stack.pop().value
    assert True == vm.stack.pop().value
    assert True == vm.stack.pop().value

  def test_null_and_isnull(self):
    script = "null null?"

    vm = self.__run_script(script)
    assert True == vm.stack.pop().value
