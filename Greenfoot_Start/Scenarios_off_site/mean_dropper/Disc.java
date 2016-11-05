import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disc extends Actor
{
    boolean lifted = false;

    public Disc(float hue)
    {
        int high = 0xc0ffb040;
        int low = 0xc0d08000;
        
        GreenfootImage img = new GreenfootImage(20, 20);
        
        //img.setColor(new java.awt.Color(low + Greenfoot.getRandomNumber(high - low), true));
        img.setColor(new java.awt.Color(0xc0ffffff & java.awt.Color.HSBtoRGB(hue, (Greenfoot.getRandomNumber(20) + 80.0f) / 100.0f, (Greenfoot.getRandomNumber(20) + 80.0f) / 100.0f), true));
        //img.fillRect(1, 1, 20, 20);
        img.fillOval(0, 0, 20, 20);
        img.setColor(new java.awt.Color(0xc0000000, true));
        //img.fillRect(0, 0, 20, 20);
        img.drawOval(0, 0, 20, 20);
        setImage(img);
    }

    /**
     * Act - do whatever the Disc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MeanWorld world = (MeanWorld)getWorld();
        
        if (!lifted && canFall())
        {
            // If there's no-one beneath us, fall by moving down one space:
            setLocation(getX(), getY() + 1);
        }
    }    
    
    public void lifted()
    {
        lifted = true;
    }
    
    public void dropped()
    {
        lifted = false;
    }
    
    private boolean canFall()
    {
        // We can fall if we're not at the bottom, and there's no one beneath us:
        return getY() < getWorld().getHeight() - 1 && getObjectsAtOffset(0, 1, Disc.class).isEmpty();
    }
}
