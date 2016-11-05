######################################################################
# coding: utf-8
#updated version
#title:             crazy_word7.py
#author:            Steve Roberts
#purpose:           to create a long concatenated word from user input
#source:            Ras Pi Prg 24hrs - T Yours
######################################################################

import time
t = time.sleep
t(1.5)
print ("\n" * 50)
long_word = ""
letters ="Blank"

t(0.5)
print("T", end = "")
t(0.5)
print("y", end = "")
t(0.5)
print("p", end = "")
t(0.5)
print("e", end ="")
t(0.5)
print(" ", end ="")
t(0.5)

while True:
    t(0.5)
    print ("\n" * 153)
    letters = input("Type ")
    if letters == "":
        print ("\n" * 50)
        print("My new word: ",  end ="")
        t(1)
        print (long_word)      
        break
    long_word += letters

