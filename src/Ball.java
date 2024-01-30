import java.awt.*;
public class Ball {
    private int size;
    private Color color;
    private int speed;
    private int xx = (int)(Math.random()*480)+1;
    private int yy = (int)(Math.random()*480)+1;
    private int r = (int)(Math.random()*255)+1;
    private int g = (int)(Math.random()*255)+1;
    private int b = (int)(Math.random()*255)+1;
    private int s = (int)(Math.random()*50)+1;
    private int sp = (int)(Math.random()*20)+1;

    public Ball(int x, int y){
        x = xx;
        y = yy;
        size = s;
        color = new Color(r,g,b);
        speed = sp;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(xx,yy,size,size);
    }

    public void move(){
        xx += speed;
        yy += speed;
        if(xx>=480||xx<=0||yy>=480||xx<=0){
            speed=speed*-1;

        }

    }




}
