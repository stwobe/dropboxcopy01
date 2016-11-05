import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;



public class breifing extends Actor
{
    GreenfootImage im = new GreenfootImage(360,300);
    int alpha=0,back=0,level,wait=0,line=5,curLine,page=-1;
    String[][] info1 = {{"Mission: Castle Storm."," ","Welcome, Agent,","We have recently received information revealing","the wherabouts of the Mechanoid Base:","Castle Storm.","Your new mission, should you choose to accept it,","is to infiltrate Castle Storm and destroy all","offending Mechanoids"," ","Locate the door to proceed to the next floor"}, 
                        {"You will be sent in with only","a pistol, so you will need to","locate your own weapons if you need","more firepower.","Also note that health and ammunition may be","hidden in locations around the castle"," ","This mission may tip the balance in the","war against the Mechanoids."," ","Thank you, and Good luck."},
                        {"TRASMITION ENDED; C>:code.encryption.decrypt","<halted:>","<waiting>","<command recieved>","<command verified>","Confirm? y/n","<proceding with data wipe>","<command recieved>","<command verified>","<proceding with self destruct>"," "}};
   String[] codes = {" storm"," doom"," shotgun"," swarm"," warzone"," grid"," maze"," bunker"," "};
    
    public void act() 
    {
    if(alpha==255){fade();return;}
    if(wait==1){
        if(Greenfoot.getKey()==null)return;
        else{
        wait=0;
        im.setColor(Color.black);
        im.fillRect(0,0,360,300);
        
        if(page==3 || level!=1){
            getWorld().addObject(new caster(),187,150);
            alpha=245;
            back=1;
          }
        }
       }
    if(alpha==260){brief();return;}
    im.clear();
    setImage(im);
    im.setColor(new Color(0,0,0,alpha));
    im.fillRect(0,0,360,300);
    if(back==1)alpha= alpha-5;else alpha=alpha+5;
    if(alpha==-5)getWorld().removeObject(this); 
    }  
    
    public void fade(){
       caster l1 = (caster) getOneObjectAtOffset(0, 0,caster.class);
       if(l1 != null)
          getWorld().removeObject(l1);       
       Main_menu mm = (Main_menu) getOneObjectAtOffset(0, 0,Main_menu.class);
       if(mm != null)
          getWorld().removeObject(mm);   
       blood b = (blood) getOneObjectAtOffset(0, 0,blood.class);
       if(b != null)
          getWorld().removeObject(b);    
       alpha = 260;
       level = ((RaY) getWorld()).getLevel();
       if(level==9){
           getWorld().addObject(new credits(),150,150);
           getWorld().removeObject(this);
        }

       curLine=0;
    }
    
    public void brief(){
        
        level = ((RaY) getWorld()).getLevel();
        
           im.setColor(Color.red);
           if(page==-1)
               im.drawString("Floor: "+level+"     Level Code: "+codes[level-1],5,15);
           else
               im.drawString(info1[page][curLine],5,20*curLine+15);
           curLine++;
           if(curLine==11){wait=1;
                           page++;
                           curLine=0;
                           Greenfoot.getKey();
                         }
              
       
    }
    
    
}
