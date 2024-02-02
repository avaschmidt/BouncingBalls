import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MyPanel extends JPanel {
    int xLoc = (int)(Math.random()*480)+1;
    int yLoc = (int)(Math.random()*480)+1;
    int xVel = 5;
    int yVel = 5;

   // Ball ball1;
   // Ball ball2;

    Ball[] balls = new Ball[100];


    public MyPanel(){
       setBackground(Color.GREEN);
       setPreferredSize(new Dimension(500,500));
     // ball1 = new Ball(200,200);
       //ball2 = new Ball(300, 200);
        for (int i = 0; i<balls.length;i++){
            balls[i] = new Ball(xLoc,yLoc);
        }

    }



   @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("Hi");

//        g.setColor(Color.RED);
//       g.fillOval(xLoc,yLoc,20,20);

       for (int i = 0; i<balls.length;i++){
           balls[i].draw(g);
           balls[i].move(getWidth()-20,getHeight()-20);
       }

      /* ball1.draw(g);
       ball2.draw(g);

       ball1.move();
       ball2.move();*/

     //  xLoc+=xVel;
     // yLoc+=yVel;

       /*if(xLoc>=480||xLoc==0){
           xVel=xVel*-1;

       }

       if(yLoc>=480||yLoc==0){
           yVel=yVel*-1;

       }*/



       g.setColor(Color.BLUE);
       g.drawString("Hello World", 200,250);

       //delay the time
       try {
           Thread.sleep(100);
       }
       catch(InterruptedException e){
           System.out.println(e);
       };

       //calls paint component again
       repaint();
    }

}
