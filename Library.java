import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("--------------------------");
        }
    }

    public void displayPatrons() {
        System.out.println("Library Patrons:");
        for (Patron patron : patrons) {
            System.out.println(patron);
            System.out.println("--------------------------");
        }
    }
}
