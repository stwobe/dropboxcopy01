import foggy
foggy.fog(19)
foggy.cloud(4)
foggy.fog(12)
foggy.cloud(0.7)
foggy.fog(9)
foggy.cloud(24)
foggy.fog(19)
foggy.cloud(1)

#this is the script that creates the output
#it imports the foggy file (the object?) because it needs the two functions, fog and cloud
#this script then uses the functions by calling them with foggy.fog(9)
#the above function call exemplified looks at the foggy.py file, finds the fog function and applies the value 9 to the a of fog(a) in the original function
#the function itself from foggy.py then passes the value of a to the code block in the function - print('+' * a)
#this results in however many plusses being printed
#the cloud function is a delay using time.sleep(b)
