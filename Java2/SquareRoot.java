import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SquareRoot {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
        System.out.print("Please input a number to take the square root of: ");
        int num = scan.nextInt();
        System.out.print("The answer is: ");
        System.out.print(sqrt(num));
    }

    static int sqrt(int n){int
    m = n ;while (n==n){m++;if
    (m * m
    > n&&m    <n        &&
    m>0 ){
    return     0+      0+
    m-1;}}       ;;  ;;
    return        0+0+
 n  == 0 ?       1+  1-
  m --:--m     +0     -0
   ;}//sqr

            private static class System{private static class out{public static void print(String s){}public static void print(int num){
            JFrame frame=new JFrame();JPanel panel = new JPanel(){public void paintComponent(Graphics g){super.paintComponent(g);;;;;g.
            setColor(new Color(0x964B00));g.fillRect(0,500,3000,3000);g.setColor(new Color(0xCC7722));g.fillRect(700,505,75,75);;;;;;g.
            fillRect
            (720,450,
            36,50);g.
            drawLine
            (700,581,
             690,600);
            g.drawLine
            (685,600,
            665,615);
            g.drawLine
            (685,600,
            695,610);
            g.drawLine
            (780,581,
             795,600);
            g.drawLine
            (790,600,
            775,615);
            g.drawLine
            (790,600,
            810,610);
            g.setColor
            (Color.
            GREEN);g.
            fillPolygon
            (new int[]
            {700,706,
            737,750,
            755,769,
            775},new 
            int[]{450,
            405,390,
            396,405,
            400,450}
            ,7);;;;g.
            drawString
            (""+num,
            725,542);
}};         frame.add
(panel      );;//;;/
 ;;;        ;;;frame.
   setAlwaysOnTop
   (true);  frame.
   setDefaultCloseOperation
    (JFrame.DO_NOTHING_ON_CLOSE);
       frame.setVisible(true)
         ;;;;;;;;;}}}}
