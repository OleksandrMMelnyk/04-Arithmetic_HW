package app;

// Output with System.out.println()

public class MainEXpintLN {

    static int productNumber;
    static String productName;
    static int quota;
    static double price;
    static double salesTotal;
    static double salesAvg;
    static int days;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {

        productNumber = 1;
        productName = "smartphone";
        quota = 59;
        price = 205.99;
        days = 5;

        salesTotal = quota * price;
        salesAvg = salesTotal / days;

        System.out.println("Product No " + productNumber + ":" + productName +
                ",\ntotal sales for " + days + " days is " + CURRENCY + " " + salesTotal +
                ",\nsales by day is " + CURRENCY + " " + salesAvg);


        productNumber = 2;
        productName = "laptop";
        quota = 23;
        price = 455.95;
        days = 7;

        salesTotal = quota * price;
        salesAvg = salesTotal / days;

        System.out.println("Product No " + productNumber + ":" + productName +
                ",\ntotal sales for " + days + " days is " + CURRENCY + " " + salesTotal +
                ",\nsales by day is " + CURRENCY + " " + salesAvg);

    }
}
