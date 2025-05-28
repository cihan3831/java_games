package at.cihan.games.Test.products;

public class AudioBook implements Books{
    private String playSample;

    public AudioBook(String playSample) {
        this.playSample = playSample;
    }

    public String getPlaySample() {
        return playSample;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
