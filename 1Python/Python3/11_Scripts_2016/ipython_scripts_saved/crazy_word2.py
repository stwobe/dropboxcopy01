# coding: utf-8
#keep typing letters, then press enter without typing any letters
longword = ""
letter ="Blank"
while letter != "":
    letter = input("Type a letter ")
    longword += letter
else:
    print("I have a pain in my ", longword)
    
