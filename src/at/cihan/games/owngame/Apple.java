package at.cihan.games.owngame;

import org.newdawn.slick.*;
import java.awt.Rectangle;
import java.util.Random;

public class Apple implements Actor {
    private float x, y;
    private Image appleImage;
    private Random random;

    public Apple() throws SlickException {
        appleImage = new Image("at/cihan/games/owngame/apple1.png");
        random = new Random();
        respawn();
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
    }

    @Override
    public void render(org.newdawn.slick.Graphics g) {
        appleImage.draw(this.x, this.y);
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, appleImage.getWidth(), appleImage.getHeight());
    }

    public void respawn() {
        this.x = random.nextInt(50);
        this.y = random.nextInt(50);
    }
}
