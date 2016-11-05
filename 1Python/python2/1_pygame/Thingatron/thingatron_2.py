#/usr/bin/python
#author:			Steve Roberts/Linux Format magazine
#date:				18th February 2016
#title:				thingatron.py
#This is Python2 with pygame installed.
#When it launches you can click the circles to make music.
##########################################################

"""
Make annoying noises
"""

#import modules
import os, pygame

# globals
imagesource1=os.path.join('C:\Users\Samsung\Dropbox\Documents_1\Programming_4\Python\Python2\1_Pygame\Thingatron\resources',  'blob1.png')
imagesource2=os.path.join('C:\Users\Samsung\Dropbox\Documents_1\Programming_4\Python\Python2\1_Pygame\Thingatron\resources',  'blob2.png')
blob1image= pygame.image.load(imagesource1)
blob2image= pygame.image.load(imagesource2)

#define the classes for our game objects

class strobe(pygame.sprite.Sprite):
    ''' displays the moving strobe line and triggers playing notes'''
    def __init__(self):
        pygame.sprite.Sprite.__init__(self) 
        self.imagesource=os.path.join('C:\Users\Samsung\Dropbox\Documents_1\Programming_4\Python\Python2\1_Pygame\Thingatron\resources',  'strobe.png')
        self.image= pygame.image.load(self.imagesource)
        self.rect=self.image.get_rect()
        self.xpos=0
        self. tempo=5

        
    def update(self):
        self.xpos += self.tempo
        if self.xpos>=800:
            self.xpos=0
        self.rect.left=self.xpos

        
        
        
class blob(pygame.sprite.Sprite):
    '''a simple blob, many of which make up our grid of noise'''
    def __init__(self):
        # we MUST call the Sprite init method on ourself
        pygame.sprite.Sprite.__init__(self) 
        #load the image resource
        self.image=blob1image
        # get the rectangle describing the loaded image
        self.rect=self.image.get_rect()
        self.state= 0
    def toggle(self):
        self.state += 1
        if self.state > 1 :
            self.state = 0
            self.image=blob1image
        else:
            self.image=blob2image


def main():
    """the main game logic"""
#Initialize Everything
    pygame.mixer.pre_init(44100,-16,2, 1024)
    pygame.init()
    pygame.mixer.set_num_channels(12)
    screensize=(800, 600)
    screen = pygame.display.set_mode(screensize)
    pygame.display.set_caption('The amazing Thingatron')
    pygame.mouse.set_visible(1)
    sounds=[]
    for item in range(12):
        source=os.path.join('resources',  'soundsquare'+str(item+1)+'.wav')
        sounds.append(pygame.mixer.Sound(source))
    
    # set up a controlling timer for the game
    clock = pygame.time.Clock()
    #create sprite objects and add them to render groups
    spritegroup= pygame.sprite.RenderPlain()
    strobegroup= pygame.sprite.RenderPlain()
    s=strobe()
    s.add(strobegroup)
    cols=[]
    for col in range(16):
        rows=[]
        for row in range(12):
            newblob=blob()
            newblob.rect.top=row*50
            newblob.rect.left=col*50
            rows.append(newblob)
            newblob.add(spritegroup)
        cols.append(rows)
    spritegroup.draw(screen)    

    # control loop
   
    while 1:
        clock.tick(50)
        
        #check what events Pygame has caught
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                return
            elif event.type == pygame.KEYDOWN and event.key == pygame.K_ESCAPE:
                return
            elif event.type == pygame.MOUSEBUTTONDOWN:
                #determine row and column
                (mx,  my) = pygame.mouse.get_pos()
                mrow=int(my/50)
                mcol=int(mx/50)
                cols[mcol][mrow].toggle()



    #refresh the screen by drawing everything again
        strobegroup.update()
        spritegroup.draw(screen)
        strobegroup.draw(screen)
        pygame.display.flip()
        # do we need to play sounds? check position of strobe...
        if not s.xpos%50:
            #reached a new column
            column=cols[s.xpos/50]
            # this gives us a list of blobs, we can iterate through
            for item in range(12):
                if column[item].state:
                    sounds[item].play()
        # end of playing sequence
                


if __name__ == '__main__': 
    main()
    pygame.quit()
