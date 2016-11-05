# -*- coding: utf-8 -*-
#copied above line from terminal suggestion
#want to make a guessing that loops
#Success.
#Change the value of "number" for a new game
#this is Python3 or Python2

#title:		guess_loop_p3.py Dropbox
#Date:		16.02.16
#Author:	Steve Roberts earthcrust.co.uk
#			This is a guessing game that loops
#			Change the value of "number" for a new game
#			This is Python3
############################################
import time
number = 56
a = 1
while a != number:
    print('*\n' * 18)
    print 'Guess the magick number'
    print('.......')
    print
    a = input()
    a = int(a)
    time.sleep(1.3)
    if a < number:
        print ('|\n' * 17)
        time.sleep(0.2)
        print('.\n' * 12)
        time.sleep(0.2)
        print ('|\n' * 17)
        time.sleep(0.2)
        print 'Sorrrry,', a, 'is too low.'
        time.sleep(1.1)
        print
    if a > number:
        print('.\n' * 12)
        time.sleep(0.2)
        print ('|\n' * 17)
        time.sleep(0.2)
        print('.\n' * 12)
        time.sleep(0.2)
        print a, 'is a bit too high, man.'
        time.sleep(1.2)
        print
    if a == number:
        print('.*^\n' * 12)
        time.sleep(0.4)
        print ('|~}{||*&|\n' * 12)
        time.sleep(0.3)
        print('.^&%%%*%%%%KJHKS^%S)\n' * 12)
        time.sleep(0.2)
        print('.\)\(\*\)\(\_\(\)\~\~\}\{\£\n' * 12)
        time.sleep(0.1)
        print('|)(*)(*£HG*&*&^*&^*}}\^*%*%T&SS~S{P~\n' * 12)
        time.sleep(0.05)
        print('}&^%&^%^%$^£(*&)(*&)S*&%~@:~S*&(*&^^%^^%^%*S&^&%\n' * 12)
        time.sleep(0.6)
        time.sleep(0.2)
        print ('.....................................................|\n' * 7)
        time.sleep(0.1)
        print ('..............................................|\n' * 7)
        time.sleep(0.1)
        print ('..............................\n' * 7)
        time.sleep(0.1)
        print ('...............|\n' * 7)
        time.sleep(0.1)
        print ('.....|\n' * 7)
        time.sleep(0.03)
        print ('.....................................................|\n' * 7)
        time.sleep(0.03)
        print ('..............................................|\n' * 7)
        time.sleep(0.03)
        print ('..............................\n' * 7)
        time.sleep(0.03)
        print ('...............|\n' * 7)
        time.sleep(0.03)
        print ('.....|\n' * 7)
        time.sleep(0.03)
        print ('.....................................................|\n' * 7)
        time.sleep(0.1)
        print ('..............................................|\n' * 7)
        time.sleep(0.1)
        print ('..............................\n' * 7)
        time.sleep(0.1)
        print ('...............|\n' * 7)
        time.sleep(0.1)
        print ('.....|\n' * 7)
        time.sleep(0.1)
        print ('.....................................................|\n' * 7)
        time.sleep(0.05)
        print ('..............................................|\n' * 7)
        time.sleep(0.05)
        print ('..............................\n' * 7)
        time.sleep(0.05)
        print ('...............|\n' * 7)
        time.sleep(0.1)
        print ('.....|\n' * 7)
        time.sleep(0.4)
        print       
        print 'Well done, clever pants, it was', a,'.'
        time.sleep(0.5)
        print
        break
print'Game over'
print
