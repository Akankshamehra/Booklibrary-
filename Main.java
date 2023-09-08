public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Patron patron1 = new Patron(101, "John Doe");
        Patron patron2 = new Patron(102, "Jane Smith");

        library.addBook(book1);
        library.addBook(book2);
        library.addPatron(patron1);
        library.addPatron(patron2);

        library.displayBooks();
        System.out.println();
        library.displayPatrons();
    }
}
