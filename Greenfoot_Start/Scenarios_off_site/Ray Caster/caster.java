import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.*;
import java.awt.Color;




public class caster extends Actor
{

        double save[] = new double[300];   //screen saved
        double x,y,a,b,x1,y1,ang,temp,l,d,gg=500,hh=1,i;  //xy is your position  x
        double enx,eny,enang,curEn,nextEn;  //enemy position and angle between you and him, and other enemy variables
        int en, repress=0,terminated=0;
        double velx=0,vely=0;
        int menu=2,level=1;
        String keys[] = new String[12];
        int[] stats = new int[9];
        int[] previousStats = new int[9];
        double[] enX = {0};
        double[] enY = {0};
        int[] type = {0};
        int[] aimTime = {0};
        int[] fireTime = {0};
        int[] warmup = {0};
        int[] speed = {0};
        int[] health = {0};
        int enemyCounter;
        int dim;
        int[] status = {0};
        int[] arr = {0};
        Color alpha = new Color(0,0,0,0);
        
        int[][][] wall = {{{3,3,2,3,8,3,3,2,3,3},
                           {3,2,3,3,9,3,2,3,3,3},
                           {3,3,2,3,8,3,3,3,2,3},
                           {8,9,9,9,8,8,9,9,8,8},
                           {8,3,2,3,3,2,3,9,3,2},
                           {9,2,3,3,3,3,2,8,3,3},
                           {9,3,3,3,2,3,3,8,3,3},
                           {8,8,9,9,9,9,9,8,8,9},
                           {3,3,9,2,3,9,3,3,2,3},
                           {2,3,9,3,3,9,2,3,2,2}}, 
                           
                          {{3,2,1,1,1,1,1,1,2,3},
                           {3,1,8,9,8,9,8,9,1,3},
                           {3,1,0,9,8,9,8,9,1,3},
                           {3,1,8,9,8,9,8,9,1,3},
                           {3,1,8,9,8,9,8,0,1,3},
                           {3,1,8,9,8,9,8,0,1,3},
                           {3,1,8,9,8,9,8,9,1,3},
                           {3,1,0,9,8,9,8,9,1,3},
                           {3,1,8,9,8,9,8,9,1,3},
                           {3,2,1,1,1,1,1,1,2,3}},
                           
                          {{2,2,1,2,8,2,2,1,2,2},
                           {2,1,2,2,9,2,1,2,2,2},
                           {2,2,1,2,8,2,2,2,1,2},
                           {8,9,9,9,8,8,9,9,8,8},
                           {8,2,1,2,2,1,2,9,2,1},
                           {9,1,2,2,2,2,1,8,2,2},
                           {9,2,2,2,1,2,2,8,2,2},
                           {8,8,9,9,9,9,9,8,8,9},
                           {1,1,9,1,1,9,2,2,1,2},
                           {1,1,9,1,1,9,1,2,1,1}},
                        
                          {{3,3,2,3,8,3,3,2,3,3},
                           {3,2,1,1,1,1,1,1,1,3},
                           {3,3,1,4,4,1,4,4,1,3},
                           {8,9,1,4,4,1,4,4,1,8},
                           {8,3,1,1,1,1,1,1,1,2},
                           {9,2,1,4,4,1,4,4,1,3},
                           {9,3,1,4,4,1,4,4,1,3},
                           {8,8,1,1,1,1,1,1,1,9},
                           {3,3,9,2,3,9,3,3,2,3},
                           {2,3,9,3,3,9,2,3,2,2}},
                           
                          {{0,0,0,0,0,0,0,0,0,0},
                           {0,2,0,3,0,3,0,3,0,3},
                           {3,3,2,3,8,3,3,3,2,3},
                           {8,9,9,9,8,8,9,9,8,8},
                           {8,3,2,3,3,2,3,9,3,2},
                           {9,2,3,3,3,3,2,8,3,3},
                           {9,3,3,3,2,3,3,8,3,3},
                           {8,8,9,9,9,9,9,8,8,9},
                           {3,0,9,0,3,0,3,0,2,0},
                           {0,0,0,0,0,0,0,0,0,0}},
                           
                          {{4,3,4,3,4,3,4,3,4,3},
                           {4,3,1,1,1,1,1,1,1,3},
                           {4,3,1,6,6,1,6,6,1,3},
                           {4,3,1,6,6,1,6,6,1,3},
                           {4,3,1,1,1,1,1,1,1,3},
                           {4,3,1,6,6,1,6,6,1,3},
                           {4,3,1,6,6,1,6,6,1,3},
                           {4,3,1,1,1,1,1,1,1,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {0,0,0,0,0,0,0,0,0,0}},
                           
                          {{4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {0,0,0,0,0,0,0,0,0,0}}, 
                           
                          {{4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,0,0,4,0,0,3,4,3},
                           {4,3,4,1,1,1,4,3,4,3},
                           {4,3,4,3,1,3,4,3,4,3},
                           {4,3,4,3,1,3,4,3,4,3},
                           {4,3,4,3,1,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {4,3,4,3,4,3,4,3,4,3},
                           {0,0,0,0,0,0,0,0,0,0}},  
                        
                        };
                      
      int r,g,f=60,f2,shotCount=0; //basic variables
      double red,green,blue;
      int the,c;
      double[] dist = {0};
      int[] xvect = {0};
      int[] yvect = {0};
      int[] counter = {0};
      double[] aim = {0};
   GreenfootImage en1=new GreenfootImage("enemy1.png");
   GreenfootImage en2=new GreenfootImage("enemy2.png");
   GreenfootImage en3=new GreenfootImage("enemy3.png");
   
   GreenfootImage buff=new GreenfootImage(150,150);
   
   GreenfootImage Gun1=new GreenfootImage("1.png");  
   GreenfootImage Gun2=new GreenfootImage("2.png");  
   GreenfootImage Gun3=new GreenfootImage("3.png");  
   GreenfootImage Gun4=new GreenfootImage("4.png");
   
   GreenfootImage blast=new GreenfootImage("blast.png");
   
   GreenfootImage currentGun = Gun1;
   GreenfootImage itemHealth = new GreenfootImage("health.png");
   GreenfootImage itemAmmo = new GreenfootImage("ammo.png");
   GreenfootImage itemShotgun = new GreenfootImage("shotgun.png");
   GreenfootImage itemMachinegun = new GreenfootImage("machine_gun.png");
   GreenfootImage itemUzi = new GreenfootImage("uzi.png");
   GreenfootImage screen = new GreenfootImage(374,300);
   GreenfootImage map = new GreenfootImage(50,50);  
   GreenfootImage mapOverlay = new GreenfootImage(50,50);
   
   
    public void caster()
    {
        level = ((RaY) getWorld()).getLevel();
        
        setImage(screen);
        
        enX = ((RaY) getWorld()).position();
        x = enX[0];
        y = enX[1];        
        ang = enX[2];
        enX = ((RaY) getWorld()).enX();
        enY = ((RaY) getWorld()).enY();
        type = ((RaY) getWorld()).type();
        aimTime = ((RaY) getWorld()).aimTime();
        fireTime = ((RaY) getWorld()).fireTime();
        warmup = ((RaY) getWorld()).warmup();
        speed = ((RaY) getWorld()).speed();
        health = ((RaY) getWorld()).health();
        dim=((RaY) getWorld()).dim();
        status = ((RaY) getWorld()).status(dim);
        xvect = ((RaY) getWorld()).vector(dim);
        yvect = ((RaY) getWorld()).vector(dim);
        counter = ((RaY) getWorld()).vector(dim);
        dist = ((RaY) getWorld()).dist(dim);
        aim = ((RaY) getWorld()).dist(dim);
        arr =    ((RaY) getWorld()).arr();
        keys = ((RaY) getWorld()).getKeys();
        
        map.setColor(new Color(70,70,70));
        c = 0;
        for(a=0;a<20;a++){
        for(b=20;b>0;b--){  
            
            if(arr[c]>=2 && arr[c]!=4){
                map.fillRect((int)(2*a),(int)(2*b),2,2);
            }
            c++;  
            }
        if(level==7)map.fillRect(0,0,40,40);
        }
        
        
        stats = ((RaY) getWorld()).getStats();
        for(f=0;f<9;f++){
            previousStats[f] = stats[f];
        }
        
        if(stats[1]==1)currentGun = Gun1;
        if(stats[1]==2)currentGun = Gun2;
        if(stats[1]==3)currentGun = Gun3;
        if(stats[1]==4)currentGun = Gun4;
    } 


    
    
    public void act()
    {
            
      if(menu==2){
        menu=0;
        caster();
        for(f=0;f<12;f++){
            Greenfoot.isKeyDown(keys[f]); 
            }
        enemyCounter = 0;
        for(f=0;f<dim;f++){
            if(type[f]<4)enemyCounter++;
        }
        //enemyCounter=0;
        }
      if (menu!=0)return;
      screen.clear();
      mapOverlay.clear();
      
     temp = ang - 18;         //start at the left side of the screen at -18 degrees
     for(c = 0;c<300;c=c+2)      //go across the screen
      {
         a = .02*Math.cos(3.14159*(temp/180.0));  //calculate direction to send ray
         b = .02*Math.sin(3.14159*(temp/180.0));  
         
         x1 = x;            //store position to ray coordinates
         y1 = y;
         l = 0;
         the = 0;
         while(the<2 || l==800)       //fire ray
         {
             x1 = x1 + a;
             y1 = y1 + b;
             the = arr[(int)((x1+20*((int)y1)-21))];  //did you hit something?
             l = l + 1;                             //advance the distance
            } 
         l = l*.98*Math.cos(3.14159*((ang-temp)/180.0));   
         save[c]=l;
         save[c+1]=l;
         d = 255 - l/1.5;
         if(d<0)d = 0;
         l = 8000/l;         
         r = (int)(10*(x1-(int)x1));
         if(x1-(int)x1<.03 || x1-(int)x1>.97)r=(int)(10*(y1-(int)y1));
         g=0;
         d = d/255.0;
         for(red=150-(int)l;red<149+(int)l;red=red+(l/5.0)){
            f2 = (int)(d*20*wall[the-2][g][r]);
            g++;
            screen.setColor(new Color(f2,f2,f2));  
            screen.drawLine(c,(int)red,c,(int)(red+l/5.0));
            screen.drawLine(c+1,(int)red,c+1,(int)(red+l/5.0));
         }
         
         
         
         
         temp = temp + .24;                       //advance angle counter
      }   
    
     

      
      for(f = 0;f<dim;f++){  
       if(type[f]>0 && type[f]<4)mapOverlay.setColor(Color.red);
       if(type[f]>3)mapOverlay.setColor(Color.blue);
       if(status[f]!=0)
       mapOverlay.fillRect((int)(2*enY[f])-3,43-(int)(2*enX[f]),2,2);
       enx = enX[f];
       eny = enY[f];
       a = enx - (int)enx;
       b = eny - (int)eny;
       if(status[f]>1)status[f]--;
       if(a<0.501 && a>0.499 && b>0.499 && b<0.501 && status[f]!=-1 && type[f]<4){
           arr[(int)(enx)+20*(int)(eny) -21] = 0;
           a = 0;
           b = 0;
           if( x > enx) a = 1;
           if( x < enx ) a = -1;
           if (arr[(int)(enx+a)+20*(int)(eny) - 21] != 0) a = 0; 
           if( y > eny) b = 1;
           if( y < eny) b = -1;
           if(Math.hypot(enx - x, eny - y) < 2) {a = 0; b = 0;} 
           if (arr[(int)(enx+a)+20*(int)(eny+b) -21] != 0) b = 0;  
           arr[(int)(enx+a)+20*(int)(eny+b) -21] = 1;
           xvect[f] = (int)a;
           yvect[f] = (int)b;
        }
       if(type[f]!=0){
          enx = enx + xvect[f]/(double)speed[f];
          eny = eny + yvect[f]/(double)speed[f];
       }
       
       enX[f] = enx;
       enY[f] = eny;       
       dist[f] = 50*Math.hypot(enx - x, eny - y);
       if (dist[f]<500 && status[f]<0)status[f]=1; 
       if (dist[f]<51 && type[f]>3 && status[f]!=0){
          status[f] = 0; 
          if(type[f]==4){stats[0]=200;Greenfoot.playSound("health.wav");}
          if(type[f]==5 && stats[1]!=1){stats[stats[1]+4] = stats[stats[1]+4] + 5;Greenfoot.playSound("ammo.wav");}
          if(type[f]>5 ){stats[2]++;
                        Greenfoot.playSound("health.wav");}
        }
    }   
     

   
    
    nextEn = 1000000000;   
     for(f = 0;f<dim;f++){
       curEn = nextEn + .1;
       nextEn = 0;  
       
      for(f2 = 0;f2<dim;f2++){
         l = dist[f2];
         if( l < curEn  && l > nextEn) {
               nextEn = l;
               i = f2;
               }        
        } 
      en = (int)i;
      enx = enX[en];
      eny = enY[en];  
      dist[en] = 10000000;
      l = nextEn;
      b = l;
      l = 8000/l;
      enang = Math.atan2(eny-y,enx-x);  //calulate enemy angles
      enang = (enang*180)/3.14159 - ang;
      if (enang>180)enang = enang - 360;
      if (enang<-180)enang = enang + 360;  
          
      x1 = 150 + enang*8.333;
      r = status[en];
      f2 = 100;
    if((r==1 || r==3 || r==5 || r==7 || r==9) && b<500 && x1+l>0 && x1-l<300 && b>50){
            r = type[en];
            if(r==1)
              buff.drawImage(en1,0,0);
            if(r==2)
              buff.drawImage(en2,0,0);
            if(r==3)
              buff.drawImage(en3,0,0);
            if(r==4)
              buff.drawImage(itemHealth,0,0);
            if(r==5)
              buff.drawImage(itemAmmo,0,0);  
            if(r==6)
              buff.drawImage(itemShotgun,0,0);  
            if(r==7)
              buff.drawImage(itemMachinegun,0,0); 
            if(r==8)
              buff.drawImage(itemUzi,0,0); 
            buff.scale((int)(2*l),(int)(2*l));
            the = (int)(x1-l);
            if(the<-2.0*l)the=300;
            if(the<0)the=0;
            while(the!=300 && save[the]<b && the!=(int)(x1+l-1)){
                for(int i=0;i<(int)(2*l-1);i++){
                    buff.setColorAt(the-(int)(x1-l),i,alpha);
                }
                the++;
            }
            if(the!=300 && the!=(int)(x1+l-1)){
                the = (int)(x1+l)-1;
                if(the>299+2.0*l)the=-1;
                if(the>299)the=299;
                while(the!=-1 && save[the]<b && the!=(int)(x1-l+1)){
                    for(int i=0;i<(int)(2*l-1);i++){
                        buff.setColorAt((int)(the-x1+l),i,alpha);
                    }
                    the--;
                }
            }
            screen.drawImage(buff,(int)(x1-l),(int)(150-l*0.9)); //draw enemy
            buff = new GreenfootImage(150,150);
            
            
            
        }
        
        if (status[en]!=0 && x1>20 && x1<280 && type[en]<4){
        if((save[(int)x1]>b && b<500) || b<60){
         if (counter[en]==warmup[en]+1)Greenfoot.playSound("targeted.wav");
         d = counter[en];
         d++;
         if (d == aimTime[en])aim[en] = Math.atan2(eny-y,enx-x);
         if (d == fireTime[en] || b<60){
             i = aim[en];
             d = Math.atan2(eny-y,enx-x); 
                Greenfoot.playSound("laser.wav");
            if(Math.abs(d-i)<.2 || b<60){
                getWorld().addObject(new hit_blood(),(int)(x1),150); 
                Greenfoot.playSound("hit.wav");
                stats[0] = stats[0] - 10;
                ang = ang + 6*Math.random()-3;
                }else{
                  screen.setColor(Color.blue);
                  int[] a = {(int)x1,0,0,(int)x1};
                  if(x1>150){
                  a[1] = 300;
                  a[2] = 300;}
                  int[] b = {150,180,120,150};
                  screen.fillPolygon (a,b,4);   
                }
             d = 0;   
             
            }
         counter[en] = (int)d;   
        }else counter[en] = warmup[en];
        }
    }
  
    
    
    
      x1 = x;
      y1 = y;
      a = .1*Math.cos(3.14159*(ang/180.0));
      b = .1*Math.sin(3.14159*(ang/180.0)); 
              if(Greenfoot.isKeyDown(keys[0]))         //key control
                {
                x1 = x + a;
                y1 = y + b;
                }
              if(Greenfoot.isKeyDown(keys[1])) 
                {
                x1 = x - a;
                y1 = y - b;
                }
              if(Greenfoot.isKeyDown(keys[4]))
                   {
                      x1 = x + .07*Math.cos(3.14159*(ang/180.0 + .5));
                      y1 = y + .07*Math.sin(3.14159*(ang/180.0 + .5));
                   }
             if(Greenfoot.isKeyDown(keys[5])) 
                   {
                      x1 = x - .07*Math.cos(3.14159*(ang/180.0 + .5));
                      y1 = y - .07*Math.sin(3.14159*(ang/180.0 + .5));
                   }
             if(Greenfoot.isKeyDown(keys[2])) 
                      ang = ang + 1.7;
             if(Greenfoot.isKeyDown(keys[3])) 
                      ang = ang - 1.7;         
             screen.setColor(Color.red);
             the = arr[(int)x1+20*(int)y1-21];
             if(the<2 || the==4){
                  x = x1;
                  y = y1;
                }
             if(terminated!=0){
                 screen.drawString("Not All Targets Terminated",75,36);
                 terminated--;
             }
             if(the==3){
                 if (enemyCounter!=0)terminated=80;
                 else{
                 ((RaY) getWorld()).setStats(stats);
                 getWorld().addObject(new breifing(),180,150);
                 menu=1; 
                 ((RaY) getWorld()).nextLevel();
                }
                }
                
                
              if(ang >180)ang = ang - 360;   //keep the angles managable
              if(ang <-180)ang = ang + 360;
           
           if(Greenfoot.isKeyDown(keys[6]) && shotCount==0){
               
                         switch(stats[1])
                 {
                 case 1:          Gun1(); break;
                 case 2:          Gun2(); break;
                 case 3:          Gun3(); break;
                 case 4:          Gun4(); break;
                 }        
               
         }else{
               if(shotCount>0)shotCount--;
               if(repress>0)repress--;
              }
         screen.drawImage(currentGun,150,150);
         if(Greenfoot.isKeyDown(keys[8])){
             stats[1]=1;
             currentGun = Gun1;             
            }
        if(Greenfoot.isKeyDown(keys[9]) && stats[2]>1){
             stats[1]=2;
             currentGun = Gun2;             
            }
         if(Greenfoot.isKeyDown(keys[10]) && stats[2]>2){
             stats[1]=3;
             currentGun = Gun3;             
            }
        if(Greenfoot.isKeyDown(keys[11]) && stats[2]>3){
             stats[1]=4;
             currentGun = Gun4;             
            }         
        if(Greenfoot.isKeyDown(keys[7]) && stats[1]!=1){
            if(stats[stats[1]+1]==0 && stats[stats[1]+4]!=0){
            stats[stats[1]+4]--;
            Greenfoot.playSound("new_clip.wav");
            if(stats[1]==2)stats[3]=5;
            if(stats[1]==3)stats[4]=40;
            if(stats[1]==4)stats[5]=80;
          }
        }
          screen.setColor(Color.black);
          screen.fillRect(300,0,75,300);
        
          screen.setColor(Color.red);    
          screen.fillRect(320,300-stats[0],20,stats[0]);     
          screen.drawRect(319,99,21,202);  
          if (stats[0]<=0){
              ((RaY) getWorld()).setStats(previousStats);
              getWorld().addObject(new blood(),180,150);
              menu=1;
            }

      
      if (stats[1]==1){
      screen.drawString("--",310,90);
      screen.drawString("--",310,70);
    }else{
      screen.drawString(Integer.toString(stats[stats[1]+1]),310,90);  
      screen.drawString(Integer.toString(stats[stats[1]+4]),310,70); 
      }

      screen.drawImage(map,310,10);
      mapOverlay.setColor(Color.green);
      mapOverlay.fillRect((int)(y*2+.5)-3,43-(int)(x*2+.5),2,2);
      if(level!=7)
      screen.drawImage(mapOverlay,310,10);
      

    }
    

    public void Gun1(){
               if(repress!=0){
                  if(shotCount>0)shotCount--;
                  return;
                }
               repress = 4;
               screen.drawImage(blast,130,119);
               Greenfoot.playSound("colt.wav");
               for(f=0;f<dim;f++)
               {
                   if(type[f]<4){
                   enx = enX[f];
                   eny = enY[f];
                   enang = Math.atan2(eny-y,enx-x);  //calulate enemy angles
                   enang = (enang*180)/3.14159;
                   enang = enang - ang;
                   if (enang>180)enang = enang - 360;
                   if (enang<-180)enang = enang + 360; 
                   enang = enang*8.333;
                   l = 50*Math.hypot(x-enx,y-eny);
                   b = l;
                   l = 8000/l;
                   if(Math.abs(enang)<.5*l && l<150){
                   if(save[150] >b && status[f]!=0){
                       status[f] = 10;
                       health[f]--;
                       if(health[f]<=0){status[f] = 0;enemyCounter--;kill(f);}
                    }}}
                }
          
               shotCount = 0;}
          
      public void Gun2(){
               if(repress!=0){
                  if(shotCount>0)shotCount--;
                  return;
                }
                
               if(stats[3]==0)
                   return;
               stats[3]--;
               repress = 35;
               screen.drawImage(blast,120,140);
               Greenfoot.playSound("myShotgun.wav");
               for(f=0;f<dim;f++)
               {
                   if(type[f]<4){
                   enx = enX[f];
                   eny = enY[f];
                   enang = Math.atan2(eny-y,enx-x);  //calulate enemy angles
                   enang = (enang*180)/3.14159;
                   enang = enang - ang;
                   if (enang>180)enang = enang - 360;
                   if (enang<-180)enang = enang + 360; 
                   enang = enang*8.333;
                   l = 50*Math.hypot(x-enx,y-eny);
                   b = l;
                   l = 8000/l;
                   if(Math.abs(enang)<3*l && l<150){
                   if(save[150] >b && status[f]!=0){
                       status[f] = 10;
                       health[f] = health[f] - 5;
                       if(health[f]<=0){status[f] = 0;enemyCounter--;kill(f);}
                    }}}
                }
          
               shotCount = 0;}
               
               
      
      public void Gun3(){    
               if(stats[4]==0)
                   return;
               stats[4]--;
               screen.drawImage(blast,150,150);
               Greenfoot.playSound("machine2.wav");
               for(f=0;f<dim;f++)
               {
                   if(type[f]<4){
                   enx = enX[f];
                   eny = enY[f];
                   enang = Math.atan2(eny-y,enx-x);  //calulate enemy angles
                   enang = (enang*180)/3.14159;
                   enang = enang - ang;
                   if (enang>180)enang = enang - 360;
                   if (enang<-180)enang = enang + 360; 
                   enang = enang*8.333;
                   l = 50*Math.hypot(x-enx,y-eny);
                   b = l;
                   l = 8000/l;
                   if(Math.abs(enang)<.8*l && l<150){
                   if(save[150] >b && status[f]!=0){
                       status[f] = 10;
                       health[f] = health[f]-2;
                       if(health[f]<=0){
                           status[f] = 0;
                           enemyCounter--;
                           kill(f);
                        }
                    }}}
                }
          
               shotCount = 3;}
      
      public void Gun4(){
               if(stats[5]==0)
                   return;
               stats[5]--; 
               
               screen.drawImage(blast,135,135);

               Greenfoot.playSound("machine1.wav");
               for(f=0;f<dim;f++)
               {
                   if(type[f]<4){
                   enx = enX[f];
                   eny = enY[f];
                   enang = Math.atan2(eny-y,enx-x);  //calulate enemy angles
                   enang = (enang*180)/3.14159;
                   enang = enang - ang;
                   if (enang>180)enang = enang - 360;
                   if (enang<-180)enang = enang + 360; 
                   enang = enang*8.333;
                   l = 50*Math.hypot(x-enx,y-eny);
                   b = l;
                   l = 8000/l;
                   if(Math.abs(enang)<l && l<115){
                   if(save[150] >b && status[f]!=0){
                       status[f] = 10;
                       health[f] = health[f] - 2;
                       if(health[f]<=0){
                           status[f] = 0;
                           enemyCounter--;
                           kill(f);
                           }
                    }}}
                }
          
               shotCount = 1;
            }
          
     public void kill(int enemy){
        x1 = (int)enX[enemy];
        y1 = (int)enY[enemy];
        for(int a1=-1;a1<2;a1++){
        for(int a2=-1;a2<2;a2++){  
            if(arr[(int)(x1+a1)+20*(int)(y1+a2)-21]==1)arr[(int)(x1+a1)+20*(int)(y1+a2)-21]=0;            
        }
        }
            
            
        }
         
            
}



