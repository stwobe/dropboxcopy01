import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


public class Main_menu extends Actor
{    
    int x,y,lev=0;
    boolean coding=false;
    String code = " ",input;
    String[] codes = {" storm"," doom"," shotgun"," swarm"," warzone"," grid"," maze"," bunker"};
    public Main_menu(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        Greenfoot.getKey();
    }
    
    
    
    public void act() 
    {
        if(coding){
            code();
            return;
        }
        getImage().setColor(Color.black);
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
            x=mouse.getX();
            y=mouse.getY();
        }
        getImage().fillOval(40,162,9,9);
        getImage().fillOval(40,185,9,9);
        getImage().fillOval(40,212,9,9);
        getImage().setColor(Color.red);
        if(y>152 && y<171){
            getImage().fillOval(40,162,9,9);
        }
        if(y>178 && y<197){
            getImage().fillOval(40,185,9,9);
        }
        if(y>204 && y<223){
            getImage().fillOval(40,212,9,9);
        }
        
         if(Greenfoot.mouseClicked(null) && x!=-1)
         {
             if(Greenfoot.isKeyDown("G"))
             ((RaY) getWorld()).superGun();
             if(x>50 && x<199);
                if(y>152 && y<171){
                    x = -1;
                    getWorld().addObject(new breifing(),180,150);
                }
                if(y>178 && y<197){
                    x = -1;
                    getWorld().addObject(new keyEdit(),150,150);
                    getWorld().removeObject(this); 
                }
                if(y>204 && y<223 && lev==0){
                    Greenfoot.getKey();
                    coding=true;
                    lev=1;
                }

             
             
             
             
            }
    }   
    
    public void code(){
        getImage().setColor(Color.black);
        getImage().fillRect(50,230,400,400);
        input = Greenfoot.getKey();
        if(input=="backspace" && code.length()!=1)code=code.substring(0,code.length()-1); 
        if(input=="enter"){
           for(int f=0;f<8;f++){
               if(code.equalsIgnoreCase(codes[f])){
                   ((RaY) getWorld()).setLevel(f+1);
                   if(f>2)((RaY) getWorld()).setGuns(2);
                   if(f>4)((RaY) getWorld()).setGuns(3);
                   if(f>6)((RaY) getWorld()).setGuns(4);
                  }
              }
           getWorld().addObject(new breifing(),180,150);
           }
        if(input!=null && input.length()>1)input="";
        if(input!=null){
           code = code + input;
        }
        getImage().setColor(Color.red);
        getImage().drawString(code+"|",55,245);
          
    }        
    
}
