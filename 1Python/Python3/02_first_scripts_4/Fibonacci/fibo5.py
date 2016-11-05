import time
def fib(n):    # write Fibonacci series up to n
    a, b = 0, 1
    while b < n:
        print(b)
        a, b = b, a+b
        print(b*a)
        print((b*b*b)*b*b)
        time.sleep(0.005)
    print()
#fib(1000565656)
#this is a module to be imported into another program - or uncomment above line to run as a script
