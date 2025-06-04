public class BookSales {
    private String salerName;
    private int numberOfSales;
    private String salerId;

    // Constructor
    public BookSales(String salerName, int numberOfSales, String salerId) {
        this.salerName = salerName;
        this.numberOfSales = numberOfSales;
        this.salerId = salerId;
    }

    // Display method
    public void displaySalesDetails() {
        System.out.println("Saler Name: " + salerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Saler ID: " + salerId);
    }
}
