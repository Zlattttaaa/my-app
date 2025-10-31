package app6;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Метод для виведення квадрата числа
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа "+ number + "дорівнює" + square + ".");
    }

    //Метод для обчислення об'єму циліндра
    public static double cylinderVolume(double radius, double height) {
        // Формула об'єму циліндра: V = π * r² * h
        return Math.PI * radius * radius * height;
    }

    //Метод для обчислення суми елементів масиву
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    //Метод для реверсу рядка
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    //Метод для обчислення степеня a^b
    public static int power(int a, int b) {
        return (int)  Math.pow(a, b);
    }

    //Метод для виведення тексту n разів
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    //--------//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        System.out.print("Ведіть ціле число:");
        int number = sc.nextInt();
        printSquare(number);
        System.out.println();

        //2
        System.out.print("Введіть радіус:");
        double radius = sc.nextDouble();
        System.out.print("Введіть висоту:");
        double height = sc.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");
        System.out.println();

        //3
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Масив чисел: " + Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(numbers) + ".");
        System.out.println();

        //4
        sc.nextLine(); //очищення рядка
        System.out.print("введіть рядок:");
        String inputText = sc.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverseString(inputText));
        System.out.println();

        //5
        System.out.print("Введіть а:");
        int a = sc.nextInt();
        System.out.print("Введіть b:");
        int b = sc.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");
        System.out.println();

        //6
        sc.nextLine();
        System.out.print("Введіть ціле число n: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = sc.nextLine();
        repeatText(n, text);

    }

}
