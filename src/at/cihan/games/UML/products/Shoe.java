package at.cihan.games.UML.products;

import java.awt.*;

public class Shoe implements Product {
    private Color color;
    private int id;
    private String title;


    public Shoe(Color color, int id, String title) {
        this.color = color;
        this.id = id;
        this.title = title;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    public Color getColor() {
        return color;
    }
}
