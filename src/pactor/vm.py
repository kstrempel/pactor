class VM:

  def __init__(self, ast):
    self.__ast = ast
    self.__stack = []
    self.__words = {}
    self.__symbols = {}


  def create_inner_vm(self, stack_size: int):
    vm = VM(self.__ast)
    vm.__words = self.__words
    vm.__symbols = self.__symbols

    # pop parameter to inner stack
    for _ in range(0,stack_size):
      vm.stack.append(self.stack.pop())

    return vm

  def run(self):
    for node in self.__ast.nodes:
      node.run(self)

  def run_word(self, word: str):
    word_node = self.__words[word]
    inner_vm = self.create_inner_vm(word_node.from_stack)
    for node in word_node.ast.nodes:
      node.run(inner_vm)
    # pop return values
    for _ in range(0, word_node.to_stack):
      self.stack.append(inner_vm.stack.pop())

  def register_word(self, word: str, ast):
    self.__words[word] = ast

  @property
  def stack(self):
    return self.__stack

  @property
  def words(self):
    return self.__words