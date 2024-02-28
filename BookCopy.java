
public class BookCopy {
    private Book book;
    private Status status;

    public BookCopy(Book book) {
        this.book = book;
        this.status = Status.AVAILABLE;
    }

    public Book getBook() {
        return book;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
