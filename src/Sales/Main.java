package Sales;

public class Main {
    public static void main(String[] args) {
        // --- Product 1 ---
        String product1 = "smartphone";
        int quantity1 = 57;        // кількість штук
        double price1 = 213.22;    // ціна за штуку
        int days1 = 5;             // днів торгівлі

        double totalSales1 = quantity1 * price1;
        double avgSales1 = totalSales1 / days1;

        // --- Product 2 ---
        String product2 = "laptop";
        int quantity2 = 35;
        double price2 = 299.62;
        int days2 = 7;

        double totalSales2 = quantity2 * price2;
        double avgSales2 = totalSales2 / days2;

        // --- Виведення результатів ---
        System.out.printf("Product No 1: %s,%n", product1);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days1, totalSales1);
        System.out.printf("sales by day is EUR %.2f.%n", avgSales1);

        System.out.printf("Product No 2: %s,%n", product2);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days2, totalSales2);
        System.out.printf("sales by day is EUR %.2f.%n", avgSales2);
    }
}
