import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class blood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blood extends Actor
{
    GreenfootImage im = new GreenfootImage(360,300);
    int[] x1 = new int[40]; 
    int[] y1 = new int[40];
    int[] width = new int[40];
    
    public blood(){
        for(int f=0;f<40;f++){
        y1[f]= 0;
        width[f] = (int)(20*Math.random()+20);
        x1[f] = (int)(360*Math.random());
       }
       setImage(im);
       Greenfoot.getKey();
    }
        
    
    public void act() 
    {
        for(int f=0;f<40;f++){
            im.setColor(new Color(255-y1[f],0,0));
            im.drawLine(x1[f]-width[f],y1[f],x1[f]+width[f],y1[f]);
            if(Math.random()>.5)y1[f]++;
            if(Math.random()>.8 && width[f]>2)width[f]--;
            x1[f] = x1[f]+(int)(3*Math.random()-1.5);
            if(y1[1]==140 || (Greenfoot.getKey()!=null && y1[1]>20 && x1[1]<400)){
                getWorld().addObject(new breifing(),180,150);
                y1[1]=141;
                x1[1]=700;
             }
        }
        
        
        
        

    }    
}
