#title: fishies.py
#author: Steve Roberts
#date: Sunday February 21st 2016
#usage: Run this script and it will print stuff...with a value of 
#alternative usage - 
import time
def fish(x):
	time.sleep(0.7)
	print("\n" * 600)
	time.sleep(0.9)
	print ("Fishy wishers!!!!!\n" * x)
	print("")
	time.sleep(0.6)
	print(x)
	time.sleep(0.7)
	print (x ** x)
	print("")
	time.sleep(0.8)
	print ("""Blooop
			  Blooooooop
			  Bloooooooooop
			  Bloooooooooooooooooop
			  Bloooooooooooooooooooooooooooop
			  Bloooooooooooooooooooooooooooooooooooooooop
			  Bloooooooooooooooooooooooooooooooooooooooooooooooop
			  Blooooooooooooooooooooooooooooooooooooooooooooooooooooooooop""" * x)
	time.sleep(0.8)
	print("Yayyy!")
	time.sleep(1.2)
fish(10) #comment this line out if you wan to use this a function to be imported.
#and call it with fishies.fish(3), for example

	
	
