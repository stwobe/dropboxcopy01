import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;
import java.awt.Graphics;

/**
 * Displays the number of frames per second.
 * 
 * @author Michael Berry
 * @version 12/09/08
 */
public class FPS extends Actor
{
    private static final Color textColor = new Color(255, 0, 50);
    private static final String text = "FPS: ";
    private static final int updateFreq = 1;
    private long countAct;
    private long prevTime;
    private double fps;
    private String value;
    double lowest;

    /**
     * Create a new FPS object
     */
    public FPS()
    {
        value = "0";
        countAct = 0;
        setImage(new GreenfootImage(100, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);
        updateImage();
    }
    
    /**
     * Set the value of the frames per second
     */
    private void setFPS(String val)
    {
        value = val;
        updateImage();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("r"))
            lowest=1000000;
        countAct++;
        long gap = System.currentTimeMillis() - prevTime;
        if(gap != 0 && countAct % updateFreq==0) {
            fps = ((1.0/gap)*1000.0);
            Double d = lowest;
            if(fps<lowest)lowest=fps;
            value = d.toString();
            updateImage();
        }
        prevTime = System.currentTimeMillis();
    }

    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
    }
    
    
}