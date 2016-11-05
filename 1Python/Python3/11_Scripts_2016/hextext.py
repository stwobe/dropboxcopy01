#title:		hextext.py   -   Dropbox
#Date:		16.02.16
#Author:	Steve Roberts earthcrust.co.uk
#			This is a test for printing and dealing wth hex
#			I wanto use this to print Unicode using '\u2710' etc
#			This is Python3
#           #https://www.daniweb.com/programming/software-development/threads/286721/handling-hex-numbers
##########################################################################################################

print('\\u%x' % (0x2710), sep = 'u')		#This prints a slash, then 2710 and then uses u as a separator.
print('\\u%x' % (0x2710+3), sep = 'u')
