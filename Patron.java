
import java.util.ArrayList;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<BookCopy> borrowedBooks;

    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<BookCopy> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        BookCopy copy = book.getAvailableCopy();
        if (copy != null) {
            borrowedBooks.add(copy);
            copy.setStatus(Status.CHECKED_OUT);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("No available copy of " + book.getTitle() + " to borrow.");
        }
    }

    // Method to return a book
    public void returnBook(BookCopy copy) {
        if (borrowedBooks.contains(copy)) {
            borrowedBooks.remove(copy);
            copy.setStatus(Status.AVAILABLE);
            System.out.println(name + " returned " + copy.getBook().getTitle());
        } else {
            System.out.println(name + " did not borrow this copy.");
        }
    }

    public void returnBook(Book book1) {
        //TODO Auto-generated method stub
    for (BookCopy bookCopy : borrowedBooks) {
        if (bookCopy.getBook().getISBN().equals(book1.getISBN())){
            returnBook(bookCopy);
          break; 
        }
    }
    
    }
    @Override
    public String toString() {
        return "Patron: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber;
    }
}
