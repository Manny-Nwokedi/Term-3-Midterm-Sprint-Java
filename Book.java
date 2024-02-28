
import java.util.ArrayList;

public class Book {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int quantity;
    private ArrayList<BookCopy> copies;

    public Book(String title, Author author, String ISBN, String publisher, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.copies = new ArrayList<>();
        // Initialize copies of the book
        for (int i = 0; i < numberOfCopies; i++) {
            this.copies.add(new BookCopy(this));
        }
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public ArrayList<BookCopy> getCopies() {
        return copies;
    }

    public BookCopy getAvailableCopy() {
        for (BookCopy copy : copies) {
            if (copy.getStatus() == Status.AVAILABLE) {
                return copy;
            }
        }
        return null; // No available copy found
    }
    @Override
    public String toString() {
        return "Book Title: " + title + ", Author: " + author.getName() + ", ISBN: " + ISBN + ", Publisher: " + publisher + ", Quantity: " + quantity;
    }

    private int numberOfCopies;
}
