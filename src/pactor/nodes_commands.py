from pactor.vm import VM
from pactor.node_parent import AstNode
from pactor.node_stack_helper import pop_value, pop

class WhenNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    is_true = pop_value(vm)
    if is_true:
      vm.run_ast(quote.ast)
  def __repr__(self):
    return 'when'

class IfNode(AstNode):
  def run(self, vm: VM):
    quote_false = pop(vm)
    quote_true = pop(vm)
    is_true = pop_value(vm)
    if is_true:
      vm.run_ast(quote_true.ast)
    else:
      vm.run_ast(quote_false.ast)
  def __repr__(self):
    return 'if'

class TimesNode(AstNode):
  def run(self, vm: VM):
    quote = pop(vm)
    count = pop_value(vm)
    for _ in range(0, count):
      vm.run_ast(quote.ast)
  def __repr__(self):
    return 'times'
