import models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Flies", "William Golding");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Lord of the flies", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("William Golding", book.getAuthor());
    }

}
