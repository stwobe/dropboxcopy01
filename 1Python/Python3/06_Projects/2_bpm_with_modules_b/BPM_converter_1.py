#BPM converter - user inputs BPM - Python calculates how often will there be a beat. (Every 0.3 seconds say)
#Python 3
#The lines that just say input() mena you have to press Enter
#The original unfinished version is in Python3/BPM converter - this file ..
#.. is in the Projects folder (susie)
#To do - add in exceptions - so that if someone inputs a letter, say, ..
#.. by mistake, then the program tells the user to input a number.instead.

import time

import dots_printer

time.sleep(0.1)
print ('\n' * 3)
time.sleep(0.1)
print ('\n' * 3)
time.sleep(0.1)
print ('\n' * 50)
time.sleep(0.1)

print('.................................................Press Enter, please...........................................')
time.sleep(0.1)
print('\n' * 3)
input()
print ('\n' * 50)
time.sleep(0.1)

print ("Too fast to read.."	)
time.sleep(0.02)

print ('\n' * 50)
time.sleep(0.5)

dots_printer.dots2(0.03)

time.sleep(0.2)

print('\n' * 8)

print ('BPM Converter and Calculator')
print()
time.sleep(0.4)
print ('')

#print ('Press Enter')
input()
print ('\n' * 3)

print ('This program will help you work with BPMs.')
input()
print ('\n' * 5)

print ('It will actually tell you often a beat occurs, in seconds.')
input()
print ('\n' * 3)

a = input('              What is the BPM?' '\n' '\n')
print ('\n' * 5)
a = float(a) #turn a from a string into a decimal number
time.sleep(0.6)
print()

print ('\n' * 50)

print ('                   This program will now calculate    60    divided by    ', a )
time.sleep(0.3)
print ('\n' * 20)

print('This will tell you how often a beat occurs.............................................')
time.sleep(0.5)
print ('\n' * 5)

print('For example, if you wanted to synchronise some music/beats to a photo stream...........')
time.sleep(0.4)
print ('\n' * 4)

print('It would tell you how often you need to display a new picture, say.....................')
time.sleep(0.4)
print ('\n' * 4)
input('.....................................Press Enter.......................................')
print ('\n' * 6)

#Next, we need to work out 60 divided by the BPM
#b can be the answer, how often the beat occurs
b = 60/a

#dots, fast
dots_printer.dots2(0.02)
time.sleep(0.3)
print ('\n' * 2)
print ('With a BPM of', a, 'a beat occurs every -----', b, 'seconds.')
time.sleep(0.2)
print ('\n' * 3)
input()

