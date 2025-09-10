class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an array of Book references (size 3)
        Book[] books = new Book[3];

        // Step 2: Initialize each element with a Book object
        books[0] = new Book("The Alchemist", "Paulo Coelho");
        books[1] = new Book("1984", "George Orwell");
        books[2] = new Book("Clean Code", "Robert C. Martin");

        // Step 3: Print the titles of all books
        System.out.println("Book Titles:");

    }
}
