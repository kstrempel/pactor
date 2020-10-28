# Pactor Programming Language

[Forth](https://en.wikipedia.org/wiki/Forth_(programming_language)), [Factor](https://factorcode.org/) like programming language in Python.

## Motivation

My main motivation is to learn more about language design, compiler construction and [concatenative languages](https://concatenative.org/wiki/view/Concatenative%20language).

## State

Very experimental

## How to develop or use it

Clone the repository to your local machine. Create a virtual environment.

The code is only tested with python 3.8.


### Activate a Command Line

Create a link to the pactor command line tool.

```
ln -s src/pactor.py pactor
```

Run now ./pactor examples/hello.pactor


### Testing

Run the complete suite. 

```
python setup.py test
```

