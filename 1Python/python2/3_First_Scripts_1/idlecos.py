Python 2.7.4 (default, Sep 26 2013, 03:20:56) 
[GCC 4.7.3] on linux2
Type "copyright", "credits" or "license()" for more information.
>>> maths.cos(0)

Traceback (most recent call last):
  File "<pyshell#0>", line 1, in <module>
    maths.cos(0)
NameError: name 'maths' is not defined
>>> print math.cos(0)

Traceback (most recent call last):
  File "<pyshell#1>", line 1, in <module>
    print math.cos(0)
NameError: name 'math' is not defined
>>> math.cos(x)

Traceback (most recent call last):
  File "<pyshell#3>", line 1, in <module>
    math.cos(x)
NameError: name 'math' is not defined
>>> x=0
>>> math.cos(0)

Traceback (most recent call last):
  File "<pyshell#5>", line 1, in <module>
    math.cos(0)
NameError: name 'math' is not defined
>>> math.cos(x)

Traceback (most recent call last):
  File "<pyshell#6>", line 1, in <module>
    math.cos(x)
NameError: name 'math' is not defined
>>> math.cos(x):
	
SyntaxError: invalid syntax
>>> math.cos(0):
	
SyntaxError: invalid syntax
>>> import math
>>> math.cos(0)
1.0
>>> 
