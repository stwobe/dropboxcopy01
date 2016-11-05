#Compound interest calculator

import time as t

s = t.sleep

def compound():
	a = 1
	b = 1
	while b < 300:
		
		s(0.8)
		
		a, b = a + (a * 0.04), b + 1 - 1n
		
		print (a)
		print("")
		print (b)
		print ("\n" * b)
		
compound()
