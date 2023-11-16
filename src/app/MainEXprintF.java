package app;

// Output with System.out.printf()

public class MainEXprintF {

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

        System.out.printf("Product No %d: %s,%n" +
                          "total sales for %d days is %s %.2f,%n" +
                          " sales by day is %s %.2f.%n",
                       productNumber, productName, days, CURRENCY, salesTotal,
                       CURRENCY, salesAvg);


        productNumber = 2;
        productName = "laptop";
        quota = 23;
        price = 455.95;
        days = 7;

        salesTotal = quota * price;
        salesAvg = salesTotal / days;

        System.out.printf("Product No %d: %s,%n" +
                        "total sales for %d days is %s %.2f,%n" +
                        " sales by day is %s %.2f.%n",
                productNumber, productName, days, CURRENCY, salesTotal,
                CURRENCY, salesAvg);

    }
}

