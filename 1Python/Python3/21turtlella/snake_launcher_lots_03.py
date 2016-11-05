# snake_launcher_lots03
# snake_launcher_lots_03.py

'''

$ cd ~/Dropbox/2 Documents_1/13 Programming_4/1Python/Python3/21turtlella

IDLE - File - Open - snake_launcher_lots_03.py

F5 or Run - Run Module

'''

import snake_madness

def circle_of_snakes():
    while True:
        snake_madness.snake()
        forward(100)
        angle(20)

if __name__ == ("__main__"):
    circle_of_snakes()
