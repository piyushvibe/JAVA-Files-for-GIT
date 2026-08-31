class Book {

    final String ISBN;
    String title;
    String author;
    double price;

    // Constructor
    Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}

public class LibraryBook {
    public static void main(String[] args) {

        Book book = new Book(
            "978-0135166307",
            "Java Programming",
            "James Gosling",
            799
        );

        book.displayBook();

        // Cannot be changed because ISBN is final
        // book.ISBN = "978-1234567890";  // ERROR
    }
}