import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Actor
{
    private Actor alignLeftWith;

    public HighScore(Actor alignLeftWith)
    {
        this.alignLeftWith = alignLeftWith;
        setImage(new GreenfootImage(1, 1));
        if (UserInfo.isStorageAvailable())
        {
            UserInfo me = UserInfo.getMyInfo();
            if (me != null)
            {
                setImage(new GreenfootImage("Your Best: " + me.getScore(), 25, java.awt.Color.WHITE, new java.awt.Color(0, true)));
            }
        }
    }
    
    public void addedToWorld(World world)
    {
        setLocation(alignLeftWith.getX() - alignLeftWith.getImage().getWidth()/2 + getImage().getWidth()/2, getY());
    }
}
