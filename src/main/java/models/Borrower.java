package models;

import java.awt.print.Book;
import java.util.Set;

public class Borrower {
private int id;
private String name;
private Set<Book> itemsBorrowed;

    public Borrower(String name, Set<Book> itemsBorrowed) {
        this.id = id;
        this.name = name;
        this.itemsBorrowed = itemsBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(Set<Book> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }
}


//A `Borrower` could have the following:
//* id (`int`)
//* name (`String`)
//* itemsBorrowed(`Set<Book>`)