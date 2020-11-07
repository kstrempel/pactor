from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import push, pop
from pactor.nodes_sequence import ArrayNode

class DictEntry:
  def __init__(self, key, value):
    self.__key = key
    self.__value = value
  @property
  def key(self):
    return self.__key
  @property
  def value(self):
    return self.__value

class DictNode(AstNode):
  def __init__(self, entries, ctx):
    super().__init__(ctx)
    self.__dict = {}
    for entry in entries:
      self.__dict.update({entry.key.value: (entry.key, entry.value)})
  def run(self, vm:VM):
    push(vm, self)
  @property
  def value(self):
    return self.__dict
  def __repr__(self):
    return '{' + " ".join(
      [str(str(v[0]) + " " + str(v[1]))
       for k,v in self.__dict.items()]) + '}'

class KeysDictNode(AstNode):
  def run(self, vm:VM):
    dict = pop(vm)
    result = ArrayNode(None,None)
    for k,v in dict.value.values():
      result.append(k)
    push(vm, result)

class UpdateDictNode(AstNode):
  def run(self, vm:VM):
    value = pop(vm)
    key = pop(vm)
    dict = pop(vm)
    dict.value.update({key.value: (key, value)})
    push(vm, dict)

class ContainsDictNode(AstNode):
  def run(self, vm:VM):
    key = pop(vm)
    dict = pop(vm)

class ValueDictNode(AstNode):
  def run(self, vm:VM):
    key = pop(vm)
    dict = pop(vm)

class DeleteDictNode(AstNode):
  def run(self, vm:VM):
    key = pop(vm)
    dict = pop(vm)