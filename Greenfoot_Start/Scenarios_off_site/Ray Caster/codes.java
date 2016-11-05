import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class codes extends Actor
{
    String code = " ",input;
    GreenfootImage im = new GreenfootImage(200,20);
    String[] codes = {" storm"," doom"," shotgun"," swarm"," warzone"," grid"," maze"," bunker"};
    
    public void act() 
    {
      setImage(im);
      im.clear();
      input = Greenfoot.getKey();
      if(input=="backspace")getWorld().removeObject(this); 
      if(input=="enter"){
         for(int f=0;f<8;f++){
             if(code.equalsIgnoreCase(codes[f])){
                 ((RaY) getWorld()).setLevel(f+1);
                 if(f>2)((RaY) getWorld()).setGuns(2);
                 if(f>4)((RaY) getWorld()).setGuns(3);
                 if(f>6)((RaY) getWorld()).setGuns(4);
                }
            }
         getWorld().removeObject(this); 
        }
      if(input!=null){
         code = code + input;
        }
      im.setColor(Color.red);
      im.drawString(code+"|",0,10);
          
          
    }    
}
