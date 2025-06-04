public class Book {
    private String bookName;
    private String author;
    private String publisher;
    private double price;
    private int yearOfPublished;

    // Constructor
    public Book(String bookName, String author, String publisher, double price, int yearOfPublished) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    // Display method
    public void displayBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }
}
