import javax.swing.*;
import java.awt.*;
public class Main {
//public static double width;
//public static double length;
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        MyPanel panel = new MyPanel();


       //  width = frame.getWidth();
      //  length = frame.getHeight();


        //frame.setSize(500,500);
        //panel.setBackground(Color.RED);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}