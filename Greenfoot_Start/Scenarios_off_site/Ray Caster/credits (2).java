import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


public class credits extends Actor
{
    String[] credits = {"Congratulations, Agent","You have succesfully destroyed all","of the Mechanoid battle Droids"," ","With this new advantage we are","sure to win the war!"," ","Until next Time,","Thank you, and goodbye"," ","<TRANSMITION COMPLETE>","<waiting>","<command recieved>","<executing self destruct>"};
    String[] thanks = {"Special thanks to Mik","for the tremendous speed boost and","improved coding,","And to Zerg, who ensured","that the enemies were","not just red spheres"," ","Thanks for Playing!"," ","<TRANSMITION ENDED>"};
    GreenfootImage im = new GreenfootImage(300,300);
    int line=0,page=0;
    String str;
    
    public void act() 
    {
      im.setColor(Color.black);
      if(line==0)im.fillRect(0,0,300,300);
      if(line==14){
          str = Greenfoot.getKey();
          if(str!=null){
              page=1;
              im.clear();
              line=0;}
          return;
        }
      setImage(im);
      im.setColor(Color.red);
      if(page==0)
      im.drawString(credits[line],10,15*line + 15);
      else
      im.drawString(thanks[line],10,15*line + 15);
      line++;
      Greenfoot.getKey();
    }    
}
