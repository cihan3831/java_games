package at.cihan.games.owngame;

import org.newdawn.slick.GameContainer;
import java.awt.*;

public interface Actor {
        void update(GameContainer gameContainer, int delta);
        void render(Graphics graphics);
    }
