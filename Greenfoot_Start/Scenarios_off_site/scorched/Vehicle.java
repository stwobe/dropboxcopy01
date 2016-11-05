import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle extends Actor
{
    private double exactX;
    private double velocity;
    private final static int WHEEL_RADIUS = 4;
    private final static int WHEEL_BASE = 10;
    private int age = 0;
    
    public Vehicle(double velocity)
    {
        this.velocity = velocity;
    }
    
    protected void addedToWorld(World world)
    {
        exactX = getX();
    }

    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        age += 1;
        
        RandomTerrain world = (RandomTerrain)getWorld();
        
        int centreX = getX();
        
        int leftX = centreX - WHEEL_BASE;
        int rightX = centreX + WHEEL_BASE;
        
        int leftY = world.getTerrainHeight(leftX) - WHEEL_RADIUS;
        int rightY = world.getTerrainHeight(rightX) - WHEEL_RADIUS;
        
        double angle = Math.atan2(rightY - leftY, WHEEL_BASE * 2);
        
        /*
        {
            int midY = (leftY + rightY) / 2;
            leftY = midY + (int)(-WHEEL_BASE * Math.sin(angle));
            rightY = midY + (int)(WHEEL_BASE * Math.sin(angle));
        }
        */
        
        exactX += velocity * Math.cos(Math.max(-Math.PI/4, Math.min(Math.PI/4, angle)));
        
        setLocation((int)exactX, (leftY + rightY) / 2);
        
        GreenfootImage img = new GreenfootImage(WHEEL_BASE * 3, WHEEL_BASE * 3);
        img.setColor(java.awt.Color.RED);
        
        int leftWheelX = (img.getWidth()/2) - WHEEL_BASE;
        int rightWheelX = (img.getWidth()/2) + WHEEL_BASE;
        int leftWheelY = leftY - getY() + (img.getHeight()/2);
        int rightWheelY = rightY - getY() + (img.getHeight()/2);
        
        drawWheel(img, leftWheelX, leftWheelY);
        drawWheel(img, rightWheelX, rightWheelY);
       
        int perpX = (int)(WHEEL_BASE * Math.cos(angle - Math.PI/2));
        int perpY = (int)(WHEEL_BASE * Math.sin(angle - Math.PI/2));
        
        int[] xs = new int[] {leftWheelX, leftWheelX + perpX, rightWheelX + perpX, rightWheelX};
        int[] ys = new int[] {leftWheelY, leftWheelY + perpY, rightWheelY + perpY, rightWheelY};
        
        img.fillPolygon(xs, ys, 4);
        
        setImage(img);
        
        if ((exactX < 0 && velocity < 0 )|| (exactX >= getWorld().getWidth() && velocity > 0))
        {
            getWorld().removeObject(this);
        }
    }    
    
    private void drawWheel(GreenfootImage img, int x, int y)
    {
        img.fillOval(x - WHEEL_RADIUS, y - WHEEL_RADIUS, WHEEL_RADIUS * 2, WHEEL_RADIUS * 2);
    }
    
    public int getAge()
    {
        return age;
    }
}
