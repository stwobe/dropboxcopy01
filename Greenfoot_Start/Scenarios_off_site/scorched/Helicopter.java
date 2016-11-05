import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Helicopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicopter extends Actor
{
    private int bombCountdown = 0;
    private GreenfootImage leftHelicopter = new GreenfootImage("helicopter.png");
    private GreenfootImage rightHelicopter = new GreenfootImage("helicopter.png");

    public Helicopter()
    {
        leftHelicopter.mirrorHorizontally();
    }

    /**
     * Act - do whatever the Helicopter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (bombCountdown > 0)
            bombCountdown -= 1;        
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(Math.max(50, getX() - 5), getY());
            setImage(leftHelicopter);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(Math.min(getX() + 5, getWorld().getWidth() - 50), getY());
            setImage(rightHelicopter);
        }
        
        if (Greenfoot.isKeyDown("space") && bombCountdown == 0)
        {
            getWorld().addObject(new Bomb(), getX(), getY());
            
            ((GameWorld)getWorld()).droppedBomb();
            
            bombCountdown = 30;
        }
        

    }    
}
