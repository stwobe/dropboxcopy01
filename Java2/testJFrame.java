import java.awt.*;
 import javax.swing.*; // needed for frame creation
 
 public class testJFrame
 {
   public static void main(String[] arg)
     {
       JFrame frame = new JFrame("windowName");
       frame.setBounds( 100,100,500,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
     } 
 }
