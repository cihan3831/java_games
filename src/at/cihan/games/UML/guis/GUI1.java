package at.cihan.games.UML.guis;

import at.cihan.games.UML.products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI1 implements GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<>();

    @Override
    public void start() {
        while (true) {
            System.out.println("1) show products");
            System.out.println("2) ...");
            int selection = scanner.nextInt();

            if (selection == 1) {
                for (Product product : this.products) {
                    System.out.println(product.getTitle());
                }
            }
        }
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }
}


