package app1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть суму доходу: ");
        double income = input.nextDouble();
        double taxRate;
        double taxAmount;

        if (income <= 10000) {
            taxRate = 2.5;
        } else if (income <= 25000) {
            taxRate = 4.3;
        } else {
            taxRate = 6.7;
        }

        taxAmount = income * (taxRate / 100);

        System.out.printf("Сума податку: %.2f грн (ставка %.1f%%)%n", taxAmount, taxRate);
    }
}
