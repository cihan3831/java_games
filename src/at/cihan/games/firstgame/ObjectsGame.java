package at.cihan.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangles2 rectangle;
    private Rectangles2 rectangle2;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangles2(100,100,5);
        this.rectangle2 = new Rectangles2(5,400,10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
        this.rectangle2.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.rectangle2.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Analyse"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
