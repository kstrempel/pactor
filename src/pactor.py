#! /usr/bin/env python

import argparse
import sys
import logging
import importlib # needed for runtime


from pactor.compiler import load_file, load_script
from pactor.vm import VM
from pactor.ast import Ast
from pactor.repl import repl
from pactor.runtime_exceptions import InnerPactorRuntimeError

__author__ = "kstrempel"
__copyright__ = "kstrempel"
__license__ = "mit"
__version__ = 0.2

_logger = logging.getLogger(__name__)

def parse_args(args):
    """Parse command line parameters

    Args:
      args ([str]): command line parameters as list of strings

    Returns:
      :obj:`argparse.Namespace`: command line parameters namespace
    """
    parser = argparse.ArgumentParser(
        description="Pactor Language")
    parser.add_argument(
        'file',
        metavar='FILE',
        nargs='?',
        type=str,
        default=None,
        help='starts the pactor source file')
    parser.add_argument(
        "--version",
        action="version",
        version="pactor {ver}".format(ver=__version__))
    parser.add_argument(
        "-v",
        "--verbose",
        dest="loglevel",
        help="set loglevel to INFO",
        action="store_const",
        const=logging.INFO)
    parser.add_argument(
        "-vv",
        "--very-verbose",
        dest="loglevel",
        help="set loglevel to DEBUG",
        action="store_const",
        const=logging.DEBUG)
    parser.add_argument(
        "-s",
        "--stack",
        dest="stack",
        help="prints the stack when script finised",
        action="store_const",
        const=logging.DEBUG)

    return parser.parse_args(args)


def setup_logging(loglevel):
    """Setup basic logging

    Args:
      loglevel (int): minimum loglevel for emitting messages
    """
    logformat = "[%(asctime)s] %(levelname)s:%(name)s:%(message)s"
    logging.basicConfig(level=loglevel, stream=sys.stdout,
                        format=logformat, datefmt="%Y-%m-%d %H:%M:%S")


def main(args):
    """Main entry point allowing external calls

    Args:
      args ([str]): command line parameter list
    """
    args = parse_args(args)
    setup_logging(args.loglevel)
    if args.file:
        ast = load_file(args.file)
        vm = VM(ast)
        try:
            vm.run()
        except InnerPactorRuntimeError as e:
            print(f"Runtime error in {args.file} at [{e.line}:{e.column}]")
            with open(args.file) as f:
                line = f.readline()
                for _ in range(1, e.line):
                    line = f.readline()
            print("> " + line[:-1])
            print("> " + e.error_arrow)
            print("> " + e.message)
        except Exception as e:
            print(f"Error: {e}")

        if(args.stack):
            print(vm.stack)
    else:
        repl()

def run():
    """Entry point for console_scripts
    """
    main(sys.argv[1:])


if __name__ == "__main__":
    run()
