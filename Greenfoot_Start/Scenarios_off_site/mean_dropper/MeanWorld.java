import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeanWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeanWorld extends World
{
    /**
     * Constructor for objects of class MeanWorld.
     * 
     */
    public MeanWorld()
    {    
        super(4 + 2, 30, 20);
        
        int soFar = 0;
        
        for (int x = 1; x < getWidth() - 1; x++)
        {
            int amount = 1 + Greenfoot.getRandomNumber(Math.min(7, 20 - soFar - (getWidth() - 1 - x)));
            int top = 30 - amount;
            for (int y = top; y < getHeight(); y++)
            {
                addObject(new Disc((float)(x - 1) / (float)(getWidth() - 2)), x, y);
            }
            soFar += amount;
        }
        
        addObject(new Dropper(), 1, 22);
        
        
        GreenfootImage img = new GreenfootImage(getWidth() * getCellSize(), getHeight() * getCellSize());
        img.setColor(java.awt.Color.WHITE);
        img.fill();
        for (int y = 23; y < getHeight(); y++)
        {

            img.setColor(java.awt.Color.LIGHT_GRAY);
            img.drawLine(0, y * 20, 200, y * 20);
        
        
            GreenfootImage text = new GreenfootImage("" + (30 - y), 12, java.awt.Color.BLACK, new java.awt.Color(0, true));
            img.drawImage(text, 0, y * 20 + 1);
            img.drawImage(text, img.getWidth() - 15, y * 20 + 1);
        }
        setBackground(img);
    }
}
