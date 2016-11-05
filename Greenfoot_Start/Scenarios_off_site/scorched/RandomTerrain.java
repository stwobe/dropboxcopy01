import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world demonstrating random terrain generation.
 * 
 * The algorithm is taken from early in this article:
 * 
 * http://gameprogrammer.com/fractal.html
 * 
 * @author Neil Brown
 */
public class RandomTerrain extends World
{
    private int[] actualHeight;

    public RandomTerrain(int width, int height)
    {
        super(width, height, 1); 
        randomise();
    }

    /**
     *  Generates a new random terrain from scratch
     *  and draws in onto the world background
     */
    public void randomise()
    {
        GreenfootImage image = getBackground();
        // Clear the image:
        image.setColor(java.awt.Color.WHITE);
        image.fill();
        image.setColor(java.awt.Color.BLACK);

        // Make an array of heights (0.0 is top of the world, 1.0 is the bottom):
        float[] heights = new float[image.getWidth()];
        actualHeight = new int[image.getWidth()];

        // Start everything at halfway-up the world:
        for (int i = 0; i < heights.length; i++)
        {
            heights[i] = 0.5f;
        }

        // Start off by applying algorithm to full width of the world:
        random(heights, 0, heights.length - 1, 0.25f);

        // Now draw lines according to the finished height array:
        for (int i = 0; i < heights.length; i++)
        {
            actualHeight[i] = (int)(heights[i] * image.getHeight());
            image.drawLine(i, actualHeight[i], i, image.getHeight());
        }
    }

    /**
     * Randomly generates terrain in the given range of the given array.
     * 
     * The midpoint has its height altered by some amount between -r and +r,
     * and all other heights in the range are altered so that you get a straight
     * line from the beginning of the range to the midpoint, and another
     * straight line from the midpoint to the end of the range.
     * 
     * Then the algorithm performs the same steps on the left-hand (west) side
     * of the midpoint, and on the right-hand (east) side of the midpoint,
     * but with the value of r halved.
     * 
     * @param heights The array of heights to modify
     * @param startX The start of the range to modify (inclusive)
     * @param endX The end of the range to modify (inclusive)
     * @param r The random range to use when modifying the heights
     */
    private void random(float[] heights, int startX, int endX, float r)
    {
        // When we get down to very small ranges, stop randomising
        // (this avoids the world looking too spiky, and makes sure we don't go on forever):
        if (endX - startX < 10)
            return;

        // Work out where the midpoint is:
        int midX = (startX + endX) / 2;

        // Add some amount between -r and +r :
        heights[midX] += (Math.random() * r * 2.0f) - r;

        // Set the heights either side of the midpoint accordingly:
        int i;
        for (i = 0; i < midX - startX; i++)
        {
            heights[startX + i] = heights[startX] + (heights[midX] - heights[startX]) * ((float)i / (float)(midX - startX));
        }
        for (i = 1; i <= endX - midX; i++)
        {
            heights[midX + i] = heights[midX] + (heights[endX] - heights[midX]) * ((float)i / (float)(endX - midX));
        }

        // Now apply the same algorithm to either side of the midpoint:
        random(heights, startX, midX, r / 2.0f);
        random(heights, midX, endX, r / 2.0f);
    }
    
    public int getTerrainHeight(int x)
    {
        return actualHeight[Math.max(0, Math.min(x, getWidth() - 1))];
    }
    
    public void destroyTerrain(int x, int amount)
    {
        actualHeight[x] = Math.min(getHeight(), actualHeight[x] + amount);
        getBackground().setColor(java.awt.Color.WHITE);
        getBackground().drawLine(x, 0, x, actualHeight[x] - 1);
    }
}
