package at.cihan.games.firstgame;

import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {

    private List<Actor> actors;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            boolean moveRight = true;
            Rectangles2 rectangle = new Rectangles2(
                    random.nextInt(600), // x-Position
                    random.nextInt(600), // y-Position
                    random.nextInt(20) + 5, // Breite
                    moveRight // Richtung
            );
            actors.add(rectangle);
        }

        for (int i = 0; i < 5; i++) {
            Ellipse ellipse = new Ellipse(
                    random.nextInt(800),
                    random.nextInt(600)
            );
            this.actors.add(ellipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("07_Games"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

