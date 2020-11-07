from helpers import Helper
from pactor.nodes_expression import NullNode

class TestDictionary(Helper):

  def test_dictonary(self):
    script = """
    { "1" 1 "2" 2 "3" 3 "4" 4 "5" 5 }
    """
    self.run_script(script)

  def test_dictonary_with_quote(self):
    script = """
    { 1 ["hello"] }
    """
    self.run_script(script)

  def test_dictonary_with_method(self):
    script = """
    { 1 hello }
    """
    self.run_script(script)

  def test_dictonary_get_keys(self):
      script = """
      { 1 10 2 20 3 30 } d>keys s>stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 3
      assert stack.pop().value == 2
      assert stack.pop().value == 1

  def test_dictonary_add_update(self):
      script = """
      { 1 10 2 20 3 30 } 4 40 d>update d>keys s>stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 4
      assert stack.pop().value == 3
      assert stack.pop().value == 2
      assert stack.pop().value == 1

  def test_dictonary_replace_update(self):
      script = """
      { 1 10 2 20 3 30 } 3 40 d>update d>keys s>stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 3
      assert stack.pop().value == 2
      assert stack.pop().value == 1

  def test_dictonary_pop(self):
      script = """
      { 1 10 2 20 3 30 } 2 d>pop swap d>keys s>stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 3
      assert stack.pop().value == 1
      assert stack.pop().value == 20

  def test_dictonary_contains(self):
      script = """
      { 1 10 2 20 3 30 } 2 d>contains?
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == True

      script = """
      { 1 10 2 20 3 30 } 5 d>contains?
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == False

  def test_dictonary_value(self):
      script = """
      { 1 10 2 20 3 30 } 2 d>value
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 20

  def test_dictonary_value_not_exists(self):
      script = """
      { 1 10 2 20 3 30 } 5 d>value
      """
      stack = self.run_script(script).stack
      assert isinstance(stack.pop(), NullNode)