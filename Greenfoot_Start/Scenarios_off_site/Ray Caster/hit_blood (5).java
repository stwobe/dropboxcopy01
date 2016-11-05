import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class overlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hit_blood extends Actor
{
int counter = 200;
    public void act() 
    {
        getImage().setTransparency(counter);
       if(counter==0)
       getWorld().removeObject(this);
        counter=counter-10;
    }    
}
