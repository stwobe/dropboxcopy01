import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    //private static int EXPLOSION_RADIUS = 10;
    private static int FALL_SPEED = 4;
    private static int BOMB_SIZE = 5;

    public Bomb()
    {
        GreenfootImage img = new GreenfootImage(BOMB_SIZE, BOMB_SIZE);
        img.setColor(java.awt.Color.GRAY);
        img.fill();
        setImage(img);
    }

    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + FALL_SPEED);
        
        GameWorld world = (GameWorld)getWorld();
        
        Vehicle vehicle = (Vehicle)getOneIntersectingObject(Vehicle.class);
        if (vehicle != null)
        {
            world.killedVehicle(vehicle.getAge());
            world.removeObject(vehicle);
            world.removeObject(this);
            return;
        }
        
        if (world.getTerrainHeight(getX() - 1) < getY() + 1
         || world.getTerrainHeight(getX()) < getY() + 1
         || world.getTerrainHeight(getX() + 1) < getY() + 1)
        {
            //Blow up:
            /*
            
            for (int i = -EXPLOSION_RADIUS; i < EXPLOSION_RADIUS; i++)
            {
                int height = (int)Math.sqrt(EXPLOSION_RADIUS*EXPLOSION_RADIUS - i*i);
                
                int topContact = Math.max(world.getTerrainHeight(getX() + i), getY() - height);
                int bottomContact = Math.max(world.getTerrainHeight(getX() + i), getY() + height);
                
                if (getY() + height >= world.getTerrainHeight(getX() + i))
                {
                    world.destroyTerrain(getX() + i, bottomContact - topContact + 1);
                }
            }
            */
            
            world.removeObject(this);
        }
    }    
}
