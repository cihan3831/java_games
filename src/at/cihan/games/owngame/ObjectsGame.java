package at.cihan.games.owngame;

import at.cihan.games.owngame.ObjectsGame;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class ObjectsGame extends BasicGame {
    private Snake snake;
    private Apple apple;
    private List<Actor> actors;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        actors = new ArrayList<>();
        snake = new Snake();
        apple = new Apple();

        actors.add(snake);
        actors.add(apple);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        for (Actor actor : actors) {
            actor.update(container, delta);
        }

        if (snake.getBounds().intersects(apple.getBounds())) {
            apple.respawn();
        }
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        for (Actor actor : actors) {
            actor.render(g);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Snake"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

