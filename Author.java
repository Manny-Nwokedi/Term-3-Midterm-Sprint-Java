
import java.util.ArrayList;
import java.util.Date;

public class Author {
    private String name;
    private Date birthDate;
    private ArrayList<Book> writtenBooks;

    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Book> getWrittenBooks() {
        return writtenBooks;
    }
    @Override
    public String toString() {
        return "Author: " + name + ", Birth Date: " + birthDate;
    }

    private Date dateOfBirth;
}
