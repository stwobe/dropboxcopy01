#title div11.py - this is a module (and a function)
#Knoppix 7.4.2 USB
#try with dividing by 11 function/module/script
def div(x): #divide a sequence of numbers by 11 - this line defines a function called div that has parameter x - we will run this as a function/module later by choosing a value for x
	"""Divide a sequence of numbers by 11 to see recurring decimal patterns """
	a = 1
	while a < x:
		print (a/11) #divide 1/11, then 2/11 etc
		a = a +1     #this turns a = 1 into a =2 then sends it back to the start of the function at 'while a < x'
print ('You have just been dividing numbers by 11')
#in terminal we have Python3
#therefore, import this module with
#import div11 (in interactive mode <<<)
#then to use the module you could run for example
#div11.div(10))   - the '10' is the value we set for x
#so no problem to run as a module, to run as a functtion you have to
#type the whole thing into the interactive mode - from 'def div(x) down to 'a = a + 1'
#then running div(10) should work in interactive mode (<<<)

