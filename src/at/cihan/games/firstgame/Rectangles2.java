package at.cihan.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rectangles2 implements Actor{
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;
    private boolean moveRight;

    public Rectangles2(int x, int y, float speed, boolean moveRight) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.moveRight = moveRight;
    }


    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }
    public void update(GameContainer gameContainer, int delta) {
        if (moveRight) {
            this.x += (float) delta / this.speed;
        } else {
            this.x -= (float) delta / this.speed;
        }
    }
}


