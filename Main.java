package probState4;
public class Main {
    public static void main(String[] args) {
        // Book details
        Book book = new Book("Atomic Habits", "James Clear", "Penguin", 499.0, 2018);
        book.displayBookDetails();

        System.out.println("-----------------------------");

        // Book sales details
        BookSales sales = new BookSales("Ankit Sharma", 250, "SAL123");
        sales.displaySalesDetails();
    }
}
