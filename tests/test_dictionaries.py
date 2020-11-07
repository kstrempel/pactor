from helpers import Helper

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
      { 1 10 2 20 3 30 } keys seq2stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 3
      assert stack.pop().value == 2
      assert stack.pop().value == 1

  def test_dictonary_add_update(self):
      script = """
      { 1 10 2 20 3 30 } 4 40 update keys seq2stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 4
      assert stack.pop().value == 3
      assert stack.pop().value == 2
      assert stack.pop().value == 1

  def test_dictonary_repalce_update(self):
      script = """
      { 1 10 2 20 3 30 } 3 40 update keys seq2stack
      """
      stack = self.run_script(script).stack
      assert stack.pop().value == 3
      assert stack.pop().value == 2
      assert stack.pop().value == 1