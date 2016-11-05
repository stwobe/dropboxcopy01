import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


public class keyEdit extends Actor
{
    GreenfootImage im = new GreenfootImage(300,300);
    String[] str = {"forwards","backwards","right","left","strafe right","strafe left","fire","reload","wepon 1","wepon 2","wepon 3","wepon 4"};
    String[] new_str = new String[12];
    String[] cur_str = new String[12];
    String key;
    int a=0,b=0;
    
    public void act() 
    {
       cur_str = ((RaY) getWorld()).getKeys();
       setImage(im);
       im.clear();
       im.setColor(Color.black);
       im.fillRect(0,0,300,300);
       im.setColor(Color.red);
       for(int f=0;f<12;f++){
           im.drawString(str[f],20,25*f+15);
           im.drawString(cur_str[f],100,25*f+15);
        }
       im.drawString(">",10,25*a+15); 
       if(b==0){
           key = Greenfoot.getKey();
           b=1;
        }
       key = Greenfoot.getKey();
       if(key!=null){
          cur_str[a] = key;
          new_str[a] = key;
          a++;
        }
       if(a==12){
            ((RaY) getWorld()).setKeys(new_str);
            getWorld().addObject(new Main_menu(),150,150);
            getWorld().removeObject(this); 
        }
       
        
              
    }    
}
