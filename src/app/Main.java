package app;

public class Main {

    static String productNumber;
    static String productName;
    static double totalSales;
    static int dayCount;
    static double daySales;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {

        productNumber = "Product No 1";
        productName = "smartphone";
        totalSales = 12153.41;
        dayCount = 5;
        daySales = totalSales / dayCount;

        System.out.printf("%n%s: %s, %ntotal sales for 5 days is %s %.2f, %nsales by day is %s %.2f.",
                productNumber, productName, CURRENCY, totalSales, CURRENCY, daySales);

        productNumber = "Product No 2";
        productName = "laptop";
        totalSales = 10486.85;
        dayCount = 7;
        daySales = totalSales / dayCount;

        System.out.printf("%n%s: %s, %ntotal sales for 7 days is %s %.2f, %nsales by day is %s %.2f.",
                productNumber, productName, CURRENCY, totalSales, CURRENCY, daySales);

    }
}