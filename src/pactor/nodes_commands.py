from pactor.vm import VM

class WhenNode():
  def run(self, vm: VM):
    quote = vm.stack.pop()
    is_true = vm.stack.pop()
    if is_true:
      vm.run_ast(quote.ast)

class IfNode():
  def run(self, vm: VM):
    quote_false = vm.stack.pop()
    quote_true = vm.stack.pop()
    is_true = vm.stack.pop()
    if is_true:
      vm.run_ast(quote_true.ast)
    else:
      vm.run_ast(quote_false.ast)

class TimesNode():
  def run(self, vm: VM):
    quote = vm.stack.pop()
    count = vm.stack.pop()
    for _ in range(0, count):
      vm.run_ast(quote.ast)