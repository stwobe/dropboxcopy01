# circle_madness_03
# circle_madness_03.py

'''

IDLE - File - Open - circle_madness_03.py - F5

'''

# or

'''

IDLE - File - Open - circle_madness_03.py - Run - Run Module

'''

# or

'''

$ cd Dropbox/2\ Documents_1/13\ Programming_4/1Python/Python3/21turtlella/
$ python3 circle_madness_03.py

'''

from turtle import *

bgcolor("blue")
pencolor("green")

penup()

left(90)
forward(300)
right(90)

pendown()

def petal():
    
    for n in range(24):
        forward(7)
        left(15)
   

def flower():
    while True:
        pencolor("orange")
        petals = 0
        pencolor("yellow")
        forward(32)

        while petals < 9:
            pencolor("orange")
            petal()
            right(40)
            forward(20)
            petals += 1
            
        pencolor("green")
        forward(180)
        right(35)
        
flower()
