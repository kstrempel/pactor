ANTLR = java org.antlr.v4.Tool

compile: python.g4
	echo "Done"

python.g4:
	$(ANTLR) -Dlanguage=Python3 Pactor.g4 -Xexact-output-dir -o src/pactor -visitor -no-listener
