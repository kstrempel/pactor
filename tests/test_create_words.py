from pactor.compiler import load_script
from pactor.vm import VM

class TestPrimitiveWords:

  def __run_script(self, script):
      ast = load_script(script)
      vm = VM(ast)
      vm.run()

      return vm

  def test_create_word(self):
    script = """
    :square ( x -- y ) dup * ;
    """

    vm = self.__run_script(script)
    assert 'square' in vm.words

  def test_create_word_and_use_it(self):
    script = """
    :square ( x -- y ) dup * ;
    10 square
    """

    vm = self.__run_script(script)
    assert 'square' in vm.words
    assert vm.stack.pop().value == 100

  def test_create_2_words_and_use_it(self):
    script = """
    :square ( x -- y ) dup * ;
    :doublesquare ( x -- y ) square square ;
    10 doublesquare
    """

    vm = self.__run_script(script)
    assert 'square' in vm.words
    assert vm.stack.pop().value == 10000

  def test_create_2dup_and_use_it(self):
    script = """
    :multidup ( x y -- x y ) * dup ;
    10 20 multidup
    """

    vm = self.__run_script(script)
    assert vm.stack.pop().value == 200
    assert vm.stack.pop().value == 200

  def test_create_word_with_quote_and_use_it(self):
    script = """
    :multidup ( x y -- x y ) * [dup] call ;
    10 20 multidup
    """

    vm = self.__run_script(script)
    assert vm.stack.pop().value == 200
    assert vm.stack.pop().value == 200

  def test_create_word_with_local_vars(self):
    script = """
    ::concat_with_space ( a b -- c ) a " " + b + ;
    "Hello" "World" concat_with_space
    """

    vm = self.__run_script(script)
    assert vm.stack.pop().value == "Hello World"
