# circle_madness_02
# circle_madness_02.py

'''

IDLE - File - Open - circle_madness_02.py - F5

'''

# or

'''

IDLE - File - Open - circle_madness_02.py - Run - Run Module

'''

# or

'''

$ cd Dropbox/2\ Documents_1/13\ Programming_4/1Python/Python3/21turtlella/
$ python3 circle_madness_02.py

'''

from turtle import *

bgcolor("blue")
pencolor("orange")

def snake():
    
    for n in range(24):
        forward(4)
        left(15)
    right(20)

circles = 0

while circles < 18:
    snake()
    circles += 1

circles = 0 

forward(100)
right(30)

while circles < 9:
    snake()
    circles += 1

