import library.Book;

public class LibraryMain {

    public static void main(String[] args) {

        Book b = new Book(
                101,
                "Java Programming",
                "James Gosling",
                599.0
        );

        b.displayBook();
    }
}