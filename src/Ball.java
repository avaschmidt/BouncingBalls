import java.awt.*;
public class Ball {
    private int x;
    private int y;
    private int size;
    private Color color;
    private int speedx;
    private int speedy;
    private int xx = (int)(Math.random()*480)+1;
    private int yy = (int)(Math.random()*480)+1;
    private int r = (int)(Math.random()*255)+1;
    private int g = (int)(Math.random()*255)+1;
    private int b = (int)(Math.random()*255)+1;
    private int s = (int)(Math.random()*50)+1;
    private int sp = (int)(Math.random()*20)+1;

    public Ball(int x, int y){
        this.x = xx;
        this.y = yy;
        size = s;
        color = new Color(r,g,b);
        speedx = sp;
        speedy = sp;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(xx,yy,size,size);
    }

    public void move(){
        xx += speedx;
        yy += speedy;
        if(xx>=480||xx<=0){
            speedx=speedx*-1;
        }
        if(yy>=480||yy<=0){
            speedy=speedy*-1;
        }

    }




}
