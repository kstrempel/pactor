from abc import ABC, abstractmethod
from pactor.vm import VM

class Node(ABC):

  @abstractmethod
  def run(self, stack):
    pass

class Ast:
  def __init__(self):
    self.__nodes = []

  def add_node(self, node: Node):
    self.__nodes.append(node)

  @property
  def nodes(self):
    return self.__nodes

  @property
  def first_node(self):
    return self.__nodes[0]




