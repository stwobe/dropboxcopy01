import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends RandomTerrain
{
    private int score = 0;
    private CurrentScore scoreDisplay;
    
    private int vehiclesLeftToSpawn = 50;

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        super(800, 600);
        
        if (!UserInfo.isStorageAvailable())
        {
            getBackground().drawImage(new GreenfootImage("Sign in to be able to record a highscore", 30, new java.awt.Color(255, 255, 255), new java.awt.Color(0, true)), 150, 560 );
        }
        
        addObject(new Helicopter(), getWidth() / 2, 20);
        
        scoreDisplay = new CurrentScore();
        addObject(scoreDisplay, 50, getHeight() - 50);
        addObject(new HighScore(scoreDisplay), 100, getHeight() - 25);
    }
    
    public void act()
    {
        if (vehiclesLeftToSpawn > 0)
        {
            if (Greenfoot.getRandomNumber(100) == 0)
            {
                vehiclesLeftToSpawn -= 1;
                int direction = Greenfoot.getRandomNumber(2) == 0 ? 1 : -1;
                
                
                addObject(new Vehicle((double)(direction * (1 + Greenfoot.getRandomNumber(6))) / 8.0), direction > 0 ? 0 : getWidth() -1, getHeight() / 2);
            }
        }
        else
        {
            if (getObjects(Vehicle.class).isEmpty())
            {
                gameOver();
            }
        }
    }
    
    public void killedVehicle(int age)
    {
        score += 100 + Math.max(0, (1000 - age) / 5);
    }
    
    public void droppedBomb()
    {
        score = Math.max(0, score - 10);
    }
    
    public int getScore()
    {
        return score;
    }
    
    private void gameOver()
    {
        removeObjects(getObjects(Helicopter.class));
        removeObjects(getObjects(Bomb.class));
        removeObjects(getObjects(Vehicle.class));
        
        UserInfo me = UserInfo.getMyInfo();
        if (me != null)
        {
            if (getScore() > me.getScore())
            {
                // It's a high-score, only update the score if ours is now higher:
                me.setScore(getScore());
                me.store();
            }
            
        }
        Greenfoot.setWorld(new ScoreWorld(getWidth(), getHeight()));
    }
}
