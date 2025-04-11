import java.util.*;

public class Borrower {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Borrower(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return name + " borrowed books: " + borrowedBooks;
    }
} 