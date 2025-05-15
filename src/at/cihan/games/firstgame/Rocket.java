package at.cihan.games.firstgame;

import org.newdawn.slick.*;

public class Rocket implements Actor{
    private Image rocketImage;
    private float x,y;

    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/rocket.png");
<<<<<<< HEAD
        this.rocketImage = tmp.getScaledCopy(50,50);
=======
        this.rocketImage = tmp.getScaledCopy(100,100);
>>>>>>> 0afba85 (done with 10_Tastaturevents)
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x,this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
            this.y--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
            this.y++;
        }
    }
<<<<<<< HEAD
=======

    public float getX() {
        return x + 50;
    }

    public float getY() {
        return y - 10;
    }


    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
<<<<<<< HEAD
>>>>>>> 0afba85 (done with 10_Tastaturevents)
}
=======
}
>>>>>>> c3c8503 (ran)
