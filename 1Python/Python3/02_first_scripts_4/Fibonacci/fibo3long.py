#See module version - fibo4.py
import time
def fib(n):    # write Fibonacci series up to n
    a, b = 0, 1
    while b < n:
        print(b)
        a, b = b, a+b
        time.sleep(0.008)
        print()
        print()
        print()
    print()
fib(10000943569347568374834756834756834756837456837465834765834765834658347658374658347658765834658735345873984579348579384759384795074568347658347658347658346583465)
