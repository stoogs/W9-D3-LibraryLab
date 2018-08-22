package models;

public class Book {
    int id;
    String title;
    String author;
    boolean onLoan;
//    Borrower currentBorrower;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.onLoan = false;
//        this.currentBorrower = currentBorrower;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
