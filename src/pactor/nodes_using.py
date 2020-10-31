from pactor.vm import VM
from pactor.node_parent import AstNode

class UsingNode(AstNode):

  def __init__(self, package: str, ctx):
    super().__init__(ctx)
    self.package = package

  def run(self, vm: VM):
    pass