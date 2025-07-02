public class Book {
    String title;
    String author;
    double price;
    static int bookCount = 0;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        bookCount++;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 15.0);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.0);

        b1.displayDetails();
        b2.displayDetails();

        System.out.println("Total books created: " + Book.bookCount);
    }
}
