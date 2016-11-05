#title:		guess_python3-version.py Dropbox
#Date:		16.02.16
#Author:	Steve Roberts earthcrust.co.uk
#			This is a guessing game that loops
#			Change the value of "number" for a new game
#			This is Python3
############################################

import time                     #This is needed for time.sleep() later, to create a pause in game.
import random
number = random.randint(0, 100) #This generates the random magick number
a = 1
while a != number: 		#Meaning: while a is NOT equal to that number
    print('*\n' * 18)
    print ('Guess the magick number')
    print('.......')
    print('')
    a = input()			#Ask for input
    a = int(a)			#Convert from a string to an integer
    time.sleep(1.3)		#Pause.....
    if a < number:
        print ('|\n' * 17)
        time.sleep(0.2)
        print('.\n' * 12)
        time.sleep(0.2)
        print ('|\n' * 17)
        time.sleep(0.2)
        print ('Sorrrry,', a, 'is too low.')
        time.sleep(1.1)
    if a > number:
        print('.\n' * 12)
        time.sleep(0.2)
        print ('|\n' * 17)
        time.sleep(0.2)
        print('.\n' * 12)
        time.sleep(0.2)
        print (a, 'is a bit too high, man.')
        time.sleep(1.2)
    if a == number:		#Meaning: if a IS equal to the number
        print('.\n' * 12)
        time.sleep(0.2)
        print ('|\n' * 17)
        time.sleep(0.2)
        print('.\n' * 12)
        time.sleep(0.2)
        print('.\n' * 12)
        time.sleep(0.2)
        print ('|\n' * 17)
        time.sleep(0.2)
        print('5\n' * 12)
        time.sleep(2)
        print('\u221a' *1440)
        time.sleep(0.2)
        time.sleep(0.2)
        print('')
        print ('Well done, clever pants, it was', a,'.')
        time.sleep(0.5)
        print('')
        break		#Come out of while loop
print('Game over')
print('')
