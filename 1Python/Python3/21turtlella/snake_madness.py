# snake_madness
# snake_madness.py

# drawing stuff with Turtle!!

# use snake_launcher.py to run this

from turtle import *

def snake():

    bgcolor("black")
    pencolor("white")
    
    pendown()

    for n in range(24):
        forward(33)
        left(34)
    
    for n in range(6):
        forward(67)
        left(78)
        forward(87)
        right(77)

    left(180)

    for n in range(5):
        left(78)
        forward(67)
        right(77)
        forward(87)

    left(80)
    forward(20)

    penup()

    forward(20)

    pendown()

    for n in range(24):
        forward(2)
        right(15)
    
    penup()

    forward(30)

    pendown()

    for n in range(24):
        forward(2)
        right(15)

    penup()

    right(90)
    forward(40)

    left(90)
    backward(5)
    right(90)

    pendown()

    for n in range(13):
        forward(4)
        right(15)

    left(180)
    left(12)

    penup()

    for n in range(6):
        forward(4)
        left(15)

    right(90)

    pendown()

    forward(25)
    right(45)

    forward(8)
    left(180)
    forward(8)
    right(90)
    forward(8)

    penup()

    forward(100)

if __name__ == ("__main__"):
    snake()
