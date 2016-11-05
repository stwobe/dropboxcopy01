// Import the basic graphics classes.
import java.awt.*;
import javax.swing.*;

public class BasicPanel extends JPanel{

    // Create a constructor method
    public BasicPanel(){
        super();
    }

     public void paintComponent(Graphics g){
        g.drawLine(10,10,150,150); // Draw a line from (10,10) to (150,150)
        int Cursor;
        int[] XArray = {10, 160, 120, 150, 20, 60};
    int[] YArray = {10, 20, 90, 150, 160, 90};
    g.drawPolygon (XArray, YArray, 6); //Draws a closed polygon defined by arrays of x and y coordinates
    } // from http://beginwithjava.blogspot.co.uk/2008/07/most-basic-graphics-app.html and http://java.comsci.us/examples/awt/graphics/drawPolygon.html

    public static void main(String arg[]){
        JFrame frame = new JFrame("BasicPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);

        BasicPanel panel = new BasicPanel();
        frame.setContentPane(panel);          
        frame.setVisible(true);                   
    }
}
