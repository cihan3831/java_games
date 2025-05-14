package at.cihan.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import java.util.Random;

public class Circle implements Actor{
    private float x,y;
    private float speed;
    private int diameter;
    private float radius;
    private float growing;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;
        this.radius = random.nextInt(20) + 10;
        this.growing = 0.05f;
    }


    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,this.diameter,this.diameter);
        graphics.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void update (GameContainer gameContainer, int delta) {
        this.y += (float)delta/this.speed;
        if(this.y>600){
            this.y = 0;
        }
        this.radius += growing * delta;
    }
}
