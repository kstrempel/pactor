import * as vscode from 'vscode';

class Term {
  static termName: string = 'pactor-terminal'; // eslint-disable-line no-undef
  static term: vscode.Terminal; // eslint-disable-line no-undef

  static _term() {
    if (!Term.term) {
			Term.term = vscode.window.createTerminal(Term.termName);
			Term.term.show(true);
			Term.run(". ./venv/bin/activate\n");

      // if user closes the terminal, delete our reference:
      vscode.window.onDidCloseTerminal(event => {
        if (Term._term() && event.name === Term.termName) {
          Term.term = undefined;
        }
      });
    }
    return Term.term;
  }

  static run(command: string) {
    console.log(`Running ${command} in ${JSON.stringify(Term._term())}`);
    Term._term().sendText(command, true);
  }

  static dispose() {
    if (Term._term()) {
      Term._term().dispose();
      Term.term = undefined;
    }
  }
}

class Repl {
  static termName: string = 'pactor-repl'; // eslint-disable-line no-undef
  static term: vscode.Terminal; // eslint-disable-line no-undef

  static _term() {
    if (!Repl.term) {
			Repl.term = vscode.window.createTerminal(Repl.termName);
			Repl.term.show(true);
			Repl.run(". ./venv/bin/activate\n");
			Repl.run("./pactor\n");

      // if user closes the terminal, delete our reference:
      vscode.window.onDidCloseTerminal(event => {
        if (Repl._term() && event.name === Repl.termName) {
          Repl.term = undefined;
        }
      });
    }
    return Repl.term;
  }

  static run(command: string) {
    console.log(`Running ${command} in ${JSON.stringify(Repl._term())}`);
    Repl._term().sendText(command, true);
  }

  static dispose() {
    if (Repl._term()) {
      Repl._term().dispose();
      Repl.term = undefined;
    }
  }
}

export function activate(context: vscode.ExtensionContext) {
	console.log('Pactor extension is now active!');

	let pactor_run = vscode.commands.registerCommand('pactor.run', () => {
		var filename = vscode.window.activeTextEditor?.document.fileName;
		Term.run('./pactor ' + filename + '\n');
	});

	let start_repl = vscode.commands.registerCommand('pactor.send_to_repl', () => {
		var textEditor = vscode.window.activeTextEditor;
		if(textEditor) {
			var firstLine = textEditor.document.lineAt(0);
			var lastLine = textEditor.document.lineAt(textEditor.document.lineCount - 1);
			var textRange = new vscode.Range(firstLine.range.start, lastLine.range.end);
			var text = textEditor.document.getText(textRange);
			text = text.split('\n').join(' ');
			Repl.run(text);
		}
	});

	context.subscriptions.push(pactor_run);
	context.subscriptions.push(start_repl);
}

// this method is called when your extension is deactivated
export function deactivate() {}
