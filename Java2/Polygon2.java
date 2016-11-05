//import java.applet.Applet;
import java.awt.*;



public class Polygon2 {



  public void paint (Graphics g) {
	  
	  public static void main(String[] args) {
	  
    int Cursor;
    int[] XArray = {20, 160, 40, 90, 130};
    int[] YArray = {50, 50, 120, 20, 120};
    g.drawPolygon (XArray, YArray, 5);
    Cursor = 0;
    while (Cursor < 5) {
      XArray [Cursor] = XArray [Cursor] + 180;
      Cursor = Cursor + 1;
    }
    g.fillPolygon (XArray, YArray, 5);
  }

}
}
