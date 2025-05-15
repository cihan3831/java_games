package at.cihan.games.UML;

public class Phone implements Product{
    private int id;
    private String title;

    public Phone(int id, String title) {
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
}
