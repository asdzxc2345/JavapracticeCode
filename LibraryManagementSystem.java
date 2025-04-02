import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private String author;
    private boolean availability;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.availability = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return availability; }

    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " book is borrowed.");
        } else {
            System.out.println(title + " book is not available.");
        }
    }

    public void returnBook() {
        availability = true;
        System.out.println(title + " book is returned.");
    }
}

// Library class
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

// User class
class User {
    private String name;

    public User(String name) {  // Fixed 'Stirng' to 'String'
        this.name = name;
    }

    public void borrowBook(Library library, String title) {
        Book book = library.findBook(title);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public void returnBook(Library library, String title) {
        Book book = library.findBook(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));

        User user = new User("Alice");
        user.borrowBook(library, "Harry Potter");
        user.borrowBook(library, "Harry Potter"); // Already borrowed
        user.returnBook(library, "Harry Potter");
        user.borrowBook(library, "The Hobbit");
    }
}
