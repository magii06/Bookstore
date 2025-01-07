package bg.bookstoresmg.model;

public class Book {
    private String author;
    private String genre;
    private boolean availability;
    private double price;
    private long ID;
    private String title;

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getPrice() {
        return price;
    }

    public long getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
