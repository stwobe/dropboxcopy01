# circle_madness_01
# circle_madness_01.py

'''

IDLE - File - Open - circle_madness_01.py - F5

'''

# or

'''

IDLE - File - Open - circle_madness_01.py - Run - Run Module

'''

# or

'''

$ cd Dropbox/2\ Documents_1/13\ Programming_4/1Python/Python3/21turtlella/
$ python3 circle_madness_01.py

'''

from turtle import *

bgcolor("blue")
pencolor("orange")

def snake():
    
    for n in range(24):
        forward(40)
        left(15)
    right(20)

while True:
    snake()

