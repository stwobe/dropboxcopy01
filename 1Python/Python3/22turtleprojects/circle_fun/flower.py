'''
This is to draw a flower.
Next thing to make after this module - "bunch_of_flowers will call flower"!
'''

from turtle import *
from petal import *


def flower():
    petals = 0
    while petals < 9:
        petal()
        right(40)
        forward(20)
        petals += 1

# This bit below is actually making a bunch of flowers
# Therefore, re-do this bit below - make it just loop one flower,
# then make bunch_of_flowers.py to make the bunch of flowers!


def main():
    penup()
    bgcolor("green")
    left(90)
    forward(250)
    right(90)
    while True:
        pencolor("orange")
        pendown()
        flower()
        penup()
        forward(180)
        right(29)

if __name__ == ("__main__"):
    main()
