
public interface Borrowable {
    void borrowBook(Patron patron, Book book);
    void returnBook(Patron patron, BookCopy copy);
}
