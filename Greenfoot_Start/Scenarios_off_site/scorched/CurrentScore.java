import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CurrentScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrentScore extends Actor
{
    public CurrentScore()
    {
        setImage(new GreenfootImage("Score: 0", 25, java.awt.Color.WHITE, new java.awt.Color(0, true)));
    }

    /**
     * Act - do whatever the CurrentScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int left = getX() - getImage().getWidth()/2;
        setImage(new GreenfootImage("Score: " + ((GameWorld)getWorld()).getScore(), 25, java.awt.Color.WHITE, new java.awt.Color(0, true)));
        setLocation(getImage().getWidth()/2 + left, getY());
    }    
}
