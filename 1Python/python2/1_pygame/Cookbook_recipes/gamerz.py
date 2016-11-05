def show_cook_book_love(screen): #from http://www.pygame.org/wiki/CookBook
    txt = "I love the Pygame cookbook!"
    f = SysFont("Arial", 12)
    s = f.render(txt, 1, (0,0,0))
    screen.blit(s, (0,0))
    
