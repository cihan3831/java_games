package at.cihan.games.Test.products;

public class Roman implements Books{
    private int id;
    private String title;
    private String genre;

    public Roman(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getPrice() {
        return this.genre.length();
    }

    @Override
    public String getDescription() {
        return "";
    }
}
