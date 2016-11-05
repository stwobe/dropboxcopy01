import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;

/**
 * Write a description of class ScoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreWorld extends World
{
    // The vertical gap between user images in the scoreboard:
    private static final int GAP = 10;
    // The height of the "All Players"/"Near Me" text at the top:
    private static final int HEADER_TEXT_HEIGHT = 25;
    // The main text color:
    private static final Color MAIN_COLOR = new Color(0x60, 0x60, 0x60); // dark grey
    // The score color:
    private static final Color SCORE_COLOR = new Color(0xB0, 0x40, 0x40); // orange-y

    /**
     * Constructor for objects of class ScoreWorld.
     * 
     */
    public ScoreWorld(int width, int height)
    {    
        super(width, height, 1); 

        drawScores();
    }
    
    //TEMP:
    public ScoreWorld()
    {
        this(800, 600);
    }
    
    private void drawString(String text, int x, int y, Color color, int height)
    {
        getBackground().drawImage(new GreenfootImage(text, height, color, new Color (0, true)), x, y);
    }
    
    private void drawScores()
    {
        // 50 pixels is the max height of the user image
        final int pixelsPerUser = 50 + 2*GAP;
        // Calculate how many users we have room for:
        final int numUsers = ((getHeight() - (HEADER_TEXT_HEIGHT + 10)) / pixelsPerUser);
        final int topSpace = getHeight() - (numUsers * pixelsPerUser) - GAP;

        drawString("All Players", 100, topSpace - HEADER_TEXT_HEIGHT - 5, MAIN_COLOR, HEADER_TEXT_HEIGHT);
        drawString("Near You", 100 + getWidth() / 2, topSpace - HEADER_TEXT_HEIGHT - 5, MAIN_COLOR, HEADER_TEXT_HEIGHT);        
        
        drawUserPanel(GAP, topSpace, (getWidth() / 2) - GAP, topSpace + numUsers * pixelsPerUser, UserInfo.getTop(numUsers));
        drawUserPanel(GAP + getWidth() / 2, topSpace, getWidth() - GAP, topSpace + numUsers * pixelsPerUser, UserInfo.getNearby(numUsers));
    }
    
    private void drawUserPanel(int left, int top, int right, int bottom, List users)
    {        
        getBackground().setColor(MAIN_COLOR);
        getBackground().drawRect(left, top, right - left, bottom - top);
        
        if (users == null)
            return;
        
        UserInfo me = UserInfo.getMyInfo();
        int y = top + GAP;
        for (Object obj : users)
        {
            UserInfo UserInfo = (UserInfo)obj;            
            Color c;
            if (me != null && UserInfo.getUserName().equals(me.getUserName()))
            {
                // Highlight our row in a sky blue colour:
                c = new Color(180, 230, 255);
            }
            else
            {
                c = Color.WHITE;
            }
            getBackground().setColor(c);
            getBackground().fillRect(left + 5, y - GAP + 1, right - left - 10, 50 + 2*GAP - 1);

            int x = left + 10;
            drawString("#" + Integer.toString(UserInfo.getRank()), x, y+18, MAIN_COLOR, 14);
            x += 50;
            drawString(Integer.toString(UserInfo.getScore()), x, y+18, SCORE_COLOR, 14);
            x += 90;
            getBackground().drawImage(UserInfo.getUserImage(), x, y);
            x += 55;
            drawString(UserInfo.getUserName(), x, y + 18, MAIN_COLOR, 14);
            y += 50 + 2*GAP;
        }
    }
}
