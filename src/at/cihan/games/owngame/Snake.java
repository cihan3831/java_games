package at.cihan.games.owngame;
import org.newdawn.slick.*;
import java.awt.Rectangle;

public class Snake implements Actor {
    private float x, y;
    private Image snakeImage;

    public Snake() throws SlickException {
        Image tmp = new Image("at/cihan/games/owngame/snake.png");
        this.snakeImage = tmp.getScaledCopy(150, 150);
        this.x = 300;
        this.y = 300;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Input input = gameContainer.getInput();
        float speed = 0.3f * delta;

        if (input.isKeyDown(Input.KEY_RIGHT)) {
            this.x += speed;
        }
        if (input.isKeyDown(Input.KEY_LEFT)) {
            this.x -= speed;
        }
        if (input.isKeyDown(Input.KEY_UP)) {
            this.y -= speed;
        }
        if (input.isKeyDown(Input.KEY_DOWN)) {
            this.y += speed;
        }
    }

    @Override
    public void render(org.newdawn.slick.Graphics g) {
        snakeImage.draw(this.x, this.y);
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, snakeImage.getWidth(), snakeImage.getHeight());
    }

    public float getX() { return x; }
    public float getY() { return y; }
}


