package classes;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    
    public void addNewBook(Book book) {
        books.add(book);
    }

    public void removeBookByNameAndAuthor(String name, String author) {
        if(books.contains(new Book(name, author))) return;
        books.remove(new Book(name, author));
    }

    public void findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book b: this.books) {
            if(b.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(b);
            }
        }
    }
}