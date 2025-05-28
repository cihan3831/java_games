package at.cihan.games.Test;

import at.cihan.games.Test.guis.GUI;
import at.cihan.games.Test.guis.GUI1;
import at.cihan.games.Test.products.AudioBook;
import at.cihan.games.Test.products.Roman;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI1();
        gui.getPrice(new Roman(2,"Nice Roman","Love"));
        gui.getPrice(new AudioBook("GG"));
        gui.start();
    }
}
