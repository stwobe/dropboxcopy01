#! /usr/bin/python3.4

# petal.py
'''
What do I want to do?
I want to put the petal function in one module.
Then, create the flower in flower.py! (Flower will call petal)
So I will end up with a project that can draw flowers.
This has been made as a project in Ninja IDE - project folder = circle_fun.
Right now, the petal.py module is the main project file - I set this in
the project properties.
'''

from turtle import *


def petal():

    for short_line in range(24):
        forward(7)
        left(15)


def main():
    bgcolor("orange")
    while True:
        pencolor("blue")
        petal()
        pencolor("white")
        petal()

if __name__ == ("__main__"):
    main()