package lv.rvt;

public class Book {
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return author + ": " + name;
    }
}
