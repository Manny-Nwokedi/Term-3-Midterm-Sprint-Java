import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;
    
    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }
    
        // Methods for managing books
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void editBook(Book oldBook, Book newBook) {
        int index = books.indexOf(oldBook);
        if (index != -1) {
            books.set(index, newBook);
        }
    }
    
    public void deleteBook(Book book) {
        books.remove(book);
    }

    // Methods for managing authors
    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void editAuthor(Author oldAuthor, Author newAuthor) {
        int index = authors.indexOf(oldAuthor);
        if (index != -1) {
            authors.set(index, newAuthor);
        }
    }

    public void deleteAuthor(Author author) {
        authors.remove(author);
    }

    // Methods for managing patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void editPatron(Patron oldPatron, Patron newPatron) {
        int index = patrons.indexOf(oldPatron);
        if (index != -1) {
            patrons.set(index, newPatron);
        }
    }

    public void deletePatron(Patron patron) {
        patrons.remove(patron);
    }

    // Borrowable interface methods
    public void borrowBook(Patron patron, Book book) {
        patron.borrowBook(book);
    }

    public void returnBook(Patron patron, Book book) {
        patron.returnBook(book);
    }

    // Unimplemented methods
    public Book[] searchBooksByTitle(String title) {
        // Implementation needed
        return null;
    }

    public Book[] searchBooksByAuthor(String authorName) {
        // Implementation needed
        return null;
    }

    public Book searchBookByISBN(String ISBN) {
        // Implementation needed
        return null;
    }
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("All Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    public void displayAllAuthors() {
        if (authors.isEmpty()) {
            System.out.println("No authors available.");
        } else {
            System.out.println("All Authors:");
            for (Author author : authors) {
                System.out.println(author);
            }
        }
    }
    public void displayAllPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons available.");
        } else {
            System.out.println("All Patrons:");
            for (Patron patron : patrons) {
                System.out.println(patron);
            }
        }
    }


}
