import javax.swing.*; // for the frame - http://en.wikiversity.org/wiki/Swing_and_AWT
import java.awt.*; // for the checkBox and the label
import java.awt.event.*; // for the checkBox listener

public class tst implements ActionListener
{ 
    // create pointers
    private boolean checkedOnce; // this boolean says if the checkBox is checked or not
    private JFrame window; 
    private JLabel label;
    private JCheckBox cb;
    private Container c;
    public static void main(String[]x)
    {
        new tst(); 
    }
    public tst() //Constructor
    {
        
         //create objects to pointers
         label = new JLabel("checkBox activated"); 
         cb = new JCheckBox("check here" , false);
        
        window = new JFrame("test");
        window.setBounds(100,100,200,200);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // define c
        c = window.getContentPane();
        // create and set layout
        FlowLayout fl = new FlowLayout();
        c.setLayout(fl);
        // add Items to Container
        c.add(cb);
        c.add(label);

        checkedOnce = false;  // checkedOnce must have a value, otherwise it is null

        window.setVisible(true);
        label.setVisible(false);

        cb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) // this method is called when one of the objects that have a listener is activated
    {
         if(checkedOnce == false)
             {
                 label.setVisible(true);
                 checkedOnce = true;  // set true, so that the next time the checkBox is klicked on, the label dissapears
             }
         else
             {
                checkedOnce = false;
                label.setVisible(false);
            }
    }
}
