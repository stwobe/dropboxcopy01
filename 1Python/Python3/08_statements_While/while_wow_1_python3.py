#this program will blow up your computer..
#Python3

a = 2

import time

while True:
	time.sleep(0.8)
	print (a)
	a = a * a

#Ctrl-c may stop the program
#Is there a way of pausing a program?

#output
#2
#4
#16
#256
#65536
#4294967296
#18446744073709551616
#340282366920938463463374607431768211456
#115792089237316195423570985008687907853269984665640564039457584007913129639936
#etc
