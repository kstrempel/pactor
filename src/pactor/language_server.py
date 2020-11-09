from pygls.features import COMPLETION
from pygls.server import LanguageServer
from pygls.types import CompletionItem, CompletionList, CompletionParams

server = LanguageServer()

@server.feature(COMPLETION, trigger_characters=[':'])
def completions(params: CompletionParams):
    """Returns completion items."""
    return CompletionList(False, [
        CompletionItem(':'),
        CompletionItem('::')
    ])


def start_ls():
    server.start_tcp('localhost', 8080)