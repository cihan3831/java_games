package at.cihan.games.UML;

import at.cihan.games.UML.guis.GUI;
import at.cihan.games.UML.guis.GUI1;
import at.cihan.games.UML.products.Car;
import at.cihan.games.UML.products.Phone;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI1();
        gui.addProduct(new Phone(1,"Superphone"));
        gui.addProduct(new Car());
        gui.start();
    }
}
