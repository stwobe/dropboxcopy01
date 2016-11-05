def calculate():
	import adder
	
	print("Input a number     ")
	d = input()
	d = int (d)

	print("Input a number     ")
	e = input()
	e = int (e)

	f = adder.add(d,e)
	
	print("So", d, "plus", e, "is")
	print(f)
	return(f)
	
if __name__ == ("__main__"):
	calculate()

