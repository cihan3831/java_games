package at.cihan.games.objectsgame;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;

public class ObjectsGameDemo extends BasicGame {
    private float rectangleX, rectangleY;
    private float circleX, circleY;
    private float ovalX, ovalY;

    private float ovalSpeed = 0.7f;
    private boolean ovalMovingRight = true;

    private float circleSpeed = 0.5f;
    private boolean circleMovingDown = true;

    private int direction = 1; // 1 right, 2 down, 3 left


    public ObjectsGameDemo(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        rectangleX = 250;
        rectangleY = 250;
        circleX = 100;
        circleY = 125;
        ovalX = 300;
        ovalY = 350;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        float ovalmove = ovalSpeed * delta;
        float circleMove = circleSpeed * delta;
        float rectMove = 0.4f * delta;

        if (ovalMovingRight) {
            ovalX += ovalmove;
            if (ovalX >= 700) ovalMovingRight = false;
        } else {
            ovalX -= ovalmove;
            if (ovalX <= 50) ovalMovingRight = true;
        }

        if (circleMovingDown) {
            circleY += circleMove;
            if (circleY >= 500) circleMovingDown = false;
        } else {
            circleY -= circleMove;
            if (circleY <= 120) circleMovingDown = true;
        }

        if (direction == 1) {
            rectangleX += rectMove;
            if (rectangleX >= 500) direction = 2;
        } else if (direction == 2) {
            rectangleY += rectMove;
            if (rectangleY >= 400) direction = 3;
        } else if (direction == 3) {
            rectangleX -= rectMove;
            if (rectangleX <= 200) direction = 4;
        } else if (direction == 4) {
            rectangleY -= rectMove;
            if (rectangleY <= 200) direction = 1;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(rectangleX, rectangleY, 120, 120);
        graphics.drawOval(circleX, circleY, 100, 100);
        graphics.drawOval(ovalX, ovalY, 150,50);
        graphics.drawString("Hello Cihan!",100,100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGameDemo("ObjectsGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
