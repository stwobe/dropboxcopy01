import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dropper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dropper extends Actor
{
    private boolean lifting = true;
    private boolean droppingRight = true;

    /**
     * Act - do whatever the Dropper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (lifting)
        {
            liftDiscs();
        }
        else
        {
            dropDiscs();
        }
    }    
    
    private void liftDiscs()
    {
        Disc disc = highestDisc();
        if (disc != null)
        {
            disc.lifted();
            if (disc.getY() == getY())
            {
                //Need to lift up all other discs
                //Important to lift from the top down, to avoid lifting a disc multiple times:
                for (int y = 0; y < getY(); y++)
                {
                    Disc otherDisc = (Disc)getOneObjectAtOffset(0, y - getY(), Disc.class);
                    if (otherDisc != null)
                    {
                        otherDisc.setLocation(otherDisc.getX(), otherDisc.getY() - 1);
                    }
                }
            }
            disc.setLocation(disc.getX(), disc.getY() - 1);
        }
        else
        {
            moveSideways(1);
            if (getX() == getWorld().getWidth() - 1)
            {
                // Must have lifted all discs:
                lifting = false;
            }
        }
    }
    
    private void dropDiscs()
    {
        boolean hasDiscs = false;
        
        if (getX() >= 1 && getX() < getWorld().getWidth() - 1)
        {
            Disc disc = (Disc)getOneObjectAtOffset(0, -1, Disc.class);
            if (disc != null)
            {
                disc.setLocation(getX(), getY());
                disc.dropped();
            }
            //Important to go from bottom up, to avoid moving discs twice:
            for (int y = getY() - 2; y >= 0; y--)
            {
                disc = (Disc)getOneObjectAtOffset(0, y - getY(), Disc.class);
                if (disc != null)
                {
                    disc.setLocation(getX(), disc.getY() + 1);
                    hasDiscs = true;
                }
            }
            
            if (!hasDiscs)
            {
                return; // No need to keep moving around
            }
        }

        if (droppingRight && getX() < getWorld().getWidth() - 1)
        {
            moveSideways(1);
        }
        else if (!droppingRight && getX() > 0)
        {
            moveSideways(-1);
        }
        else
        {
            droppingRight = !droppingRight;
        }
    
    }
    
    private void moveSideways(int amount)
    {
        for (int y = getY() - 1; y >= 0; y--)
        {
            Actor disc = getOneObjectAtOffset(0, y - getY(), Disc.class);
            if (disc != null)
            {
                disc.setLocation(disc.getX() + amount, disc.getY());
            }
        }
        setLocation(getX() + amount, getY());
    }
    
    private Disc highestDisc()
    {
        // Look from us downwards, for Discs:
        for (int y = getY(); y < getWorld().getHeight(); y++)
        {
            Disc disc = (Disc)getOneObjectAtOffset(0, y - getY(), Disc.class);
            if (disc != null)
            {
                // Stop at the first Disc we find:
                return disc;
            }
        }
        // No Discs:
        return null;
    }
}
