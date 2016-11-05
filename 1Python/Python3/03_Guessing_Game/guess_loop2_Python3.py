#want to make a guessing that loops
#Success.
#Change the value of "number" for a new game
#this is Python3
import time
number = 56
a = 1
while a != number:
    print('*\n' * 18)
    print ('Guess the magick number')
    print('.......')
    print()
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
    if a == number:
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
        print('√\n' * 12)
        time.sleep(0.2)
        time.sleep(0.2)
        print()
        print ('Well done, clever pants, it was', a,'.')
        time.sleep(0.5)
        print()
        break
print('Game over')
print()
