package at.cihan.games.Test.guis;

import at.cihan.games.Test.products.Books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI1 implements GUI{
    private Scanner scanner = new Scanner(System.in);
    private List<Books> book = new ArrayList<>();

    @Override
    public void start() {
        while(true){
            System.out.println("1) Show all Media");
            System.out.println("2) Calculate total media value in stock");
            int selection = scanner.nextInt();

            if (selection == 1){
                for (Books books : this.book){
                    System.out.println(books.getTitle());
                }
            }
            else if (selection == 2){
                for (Books books : this.book){
                    System.out.println(books.getPrice());
                }
            }
        }
    }

    @Override
    public void getPrice(Books books) {
        this.book.add(books);
    }

    @Override
    public void getAllMedia() {

    }
}

