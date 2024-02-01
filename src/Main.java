import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        MyPanel panel = new MyPanel();


        //frame.setSize(500,500);
        //panel.setBackground(Color.RED);

        frame.add(panel);
        frame.setVisible(true);


    }
}