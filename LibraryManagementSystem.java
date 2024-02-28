
import java.util.Date;

// Import statements for Author, Book, and Patron classes are missing

public class LibraryManagementSystem {
    private Library library;

    public LibraryManagementSystem() {
        this.library = new Library();
        initializeData();
    }

    private void initializeData() {
        // Create authors
        Author author1 = new Author("Manny Nwokedi", new Date(1613286000000L)); // February 14, 2021
        Author author2 = new Author("Joe Johnson", new Date(-1059698400000L)); // April 25, 1942
        Author author3 = new Author("Wanda Noble", new Date(738163200000L)); // July 18, 1972
        Author author4 = new Author("Adrian Payne", new Date(1613286000000L)); // February 14, 2021
        Author author5 = new Author("Bob Forest", new Date(0)); // Default date
        Author author6 = new Author("Bob Sky", new Date(0)); // Default date
        Author author7 = new Author("Bob Green", new Date(0)); // Default date
        Author author8 = new Author("Bob Scarlet", new Date(0)); // Default date
        Author author9 = new Author("Bob Goldman", new Date(0)); // Default date
        Author author10 = new Author("Bob Silver", new Date(0)); // Default date

        // Create books
        Book book1 = new Book("Dog and Bingo Game", author1, "ISBN001", "Publisher1", 5);
        Book book2 = new Book("Book of Life Vol 2", author2, "ISBN002", "Publisher2", 3);
        Book book3 = new Book("Who killed Tupac Shakur", author3, "ISBN001", "Publisher1", 5);
        Book book4 = new Book("The True Russian Autocracy", author4, "ISBN002", "Publisher2", 3);
        Book book5 = new Book("The Bear", author5, "ISBN003", "Publisher3", 2);
        Book book6 = new Book("The Eagle", author6, "ISBN004", "Publisher4", 4);
        Book book7 = new Book("The Green Cat", author7, "ISBN005", "Publisher5", 1);
        Book book8 = new Book("The Red Lion", author8, "ISBN006", "Publisher6", 3);
        Book book9 = new Book("The Golden Fox", author9, "ISBN007", "Publisher7", 2);
        Book book10 = new Book("The Silver Shark", author10, "ISBN008", "Publisher8", 4);

        // Create patrons
        Patron patron1 = new Patron("Kobe Bryant", "32 Boyle Street Brampton Ontario", "709-699-9132");
        Patron patron2 = new Patron("LeBron James", "65 Argue Street St John's NL", "416-745-4345");
        Patron patron3 = new Patron("Mike Tyson", "32 George Brown Blvd Brampton Ontario", "709-699-9132");
        Patron patron4 = new Patron("Kanye West", "200 Woodland Blvd Hollywood California", "416-745-4345");
        Patron patron5 = new Patron("Miguel Bell", "123 Main Street", "555-1234");
        Patron patron6 = new Patron("Santos Little", "456 Oak Avenue", "555-5678");
        Patron patron7 = new Patron("Camryn Lucero", "789 Pine Road", "555-9012");
        Patron patron8 = new Patron("Desiree Richards", "101 Cedar Lane", "555-3456");
        Patron patron9 = new Patron("Ellie Gamble", "202 Birch Street", "555-7890");
        Patron patron10 = new Patron("Kasey Wright", "303 Maple Drive", "555-2345");

        // Add authors, books, and patrons to the library
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        library.addAuthor(author4);
        library.addAuthor(author5);
        library.addAuthor(author6);
        library.addAuthor(author7);
        library.addAuthor(author8);
        library.addAuthor(author9);
        library.addAuthor(author10);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
        library.addPatron(patron5);
        library.addPatron(patron6);
        library.addPatron(patron7);
        library.addPatron(patron8);
        library.addPatron(patron9);
        library.addPatron(patron10);
    }

    // Method to add a new book
    public void addBook(Book book) {
        library.addBook(book);
    }

    // Method to edit an existing book
    public void editBook(Book oldBook, Book newBook) {
        library.editBook(oldBook, newBook);
    }

    // Method to delete a book
    public void deleteBook(Book book) {
        library.deleteBook(book);
    }

    // Method to add a new author
    public void addAuthor(Author author) {
        library.addAuthor(author);
    }

    // Method to edit an existing author
    public void editAuthor(Author oldAuthor,Author newAuthor) {
        library.editAuthor(oldAuthor, newAuthor);
    }

    // Method to delete an author
    public void deleteAuthor(Author author) {
        library.deleteAuthor(author);
    }

    // Method to add a new patron
    public void addPatron(Patron patron) {
        library.addPatron(patron);
    }

    // Method to edit an existing patron
    public void editPatron(Patron patron) {
        library.editPatron(patron, patron);
    }

    // Method to delete a patron
    public void deletePatron(Patron patron) {
        library.deletePatron(patron);
    }

    // Method to borrow a book for a patron
/* 
    public void borrowBook(Patron patron, Book book) {
        // Record the current date and time
        Date currentDate = new Date();

        // Borrow the book from the library
        library.borrowBook(patron, book);

        // Update the borrowing date and time in the book
        book.setBorrowDate(currentDate);
    }
*/

    // Method to return a book borrowed by a patron
    public void returnBook(Patron patron, Book book) {
        library.returnBook(patron, book);
    }

    // Method to search for books by title
    public Book[] searchBooksByTitle(String title) {
        return library.searchBooksByTitle(title);
    }

    // Method to search for books by author
    public Book[] searchBooksByAuthor(String authorName) {
        return library.searchBooksByAuthor(authorName);
    }

    // Method to search for books by ISBN
    public Book searchBookByISBN(String ISBN) {
        return library.searchBookByISBN(ISBN);
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        library.displayAllBooks();
    }

    // Method to display all books, authors, and patrons in the library
    public void displayAllData() {
        System.out.println("All Authors:");
        library.displayAllAuthors();

        System.out.println("\nAll Books:");
        library.displayAllBooks();

        System.out.println("\nAll Patrons:");
        library.displayAllPatrons();
    }
    public static void main(String[] args) {
        // Create an instance of LibraryManagementSystem
        LibraryManagementSystem system = new LibraryManagementSystem();

        // Call the method to display all data
        system.displayAllData();
    }
}
