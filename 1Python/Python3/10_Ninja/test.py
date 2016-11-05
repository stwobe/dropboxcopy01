c = 1
import time
def blob(d):
    while d > c:
        time.sleep(0.2)
        print (d ** d)
        d = d - 2
        print ("")

blob(10)