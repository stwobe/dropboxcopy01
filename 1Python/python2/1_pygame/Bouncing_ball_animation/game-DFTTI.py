#Python2 - this will not run on my install of Geany on OpenSUSE as it's set to Python3
import sys, pygame
pygame.init()

size = width, height = 640, 480
speed = [1, 3]
black = 0, 0, 0

screen = pygame.display.set_mode(size)

ball = pygame.image.load("man-scratch-1.png")
ballrect = ball.get_rect()

while 1:
	for event in pygame.event.get():
		if event.type == pygame.QUIT: sys.exit()
		
		ballrect = ballrect.move(speed)
		if ballrect.left < 0 or ballrect.right > width:
			speed[0] = -speed[0]
		if ballrect.top < 0 or ballrect.bottom > height:
			speed[1] = -speed[1]
			
		screen.fill(black)
		screen.blit(ball, ballrect)
		pygame.display.flip()

#tutorial from http://www.pygame.org/docs/tut/intro/intro.html
#makes a bouncing ball animation - need image (GIF not BMP like the code says)
#Pygame for Python2 is needed
#so far, it only prints a box and then quits, complaining
#changed ball to PNG - it displays (Yay!!!!) but does not bounce...
#It does bounce - you have to move the mouse around on the GUI
#Changed it so it uses a PNG that I made - the pen board..
