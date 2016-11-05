#This is fibo3 but with a time delay added in.
#This is actually not a program or script really - it is a module.
#Launch python3 interpreter, then import fibo3, then run fibo4.fib(1000000) for example.
#But, this module can be run as a script by uncommenting the bottom line so that fib() has a value.
import time
def fib(n):    # write Fibonacci series up to n
    a, b = 0, 1
    while b < n:
        print(b)
        a, b = b, a+b
        time.sleep(0.01)
    print()
#fib(10000943569347568374658346587353458739845793485793847593847950)
