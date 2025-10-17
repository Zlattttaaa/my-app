package app3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayOfRandomNumbers = {
                34, -10, 56, -22, 78, 5, 7, -15, 42, -30,
                91, 0, -50, 18, 99, -3, 25, 11, 63, -8
        };

        System.out.println("Елементи масиву: " + Arrays.toString(arrayOfRandomNumbers));

        // 1️⃣ Сума від'ємних чисел
        int sumOfNegativeNumbers = 0;
        for (int number : arrayOfRandomNumbers) {
            if (number < 0) {
                sumOfNegativeNumbers += number;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumOfNegativeNumbers);

        // 2️⃣ Кількість парних і непарних чисел
        int countEven = 0;
        int countOdd = 0;
        for (int number : arrayOfRandomNumbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Кількість парних чисел: " + countEven);
        System.out.println("Кількість непарних чисел: " + countOdd);

        // 3️⃣ Найбільший і найменший елементи + індекси
        int min = arrayOfRandomNumbers[0];
        int max = arrayOfRandomNumbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] < min) {
                min = arrayOfRandomNumbers[i];
                minIndex = i;
            }
            if (arrayOfRandomNumbers[i] > max) {
                max = arrayOfRandomNumbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        // 4️⃣ Середнє арифметичне чисел після першого від’ємного
        int firstNegativeIndex = -1;
        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1 || firstNegativeIndex == arrayOfRandomNumbers.length - 1) {
            System.out.println("Від’ємних чисел немає або після нього немає елементів.");
        } else {
            double sumAfter = 0;
            int countAfter = 0;
            for (int i = firstNegativeIndex + 1; i < arrayOfRandomNumbers.length; i++) {
                sumAfter += arrayOfRandomNumbers[i];
                countAfter++;
            }
            double average = sumAfter / countAfter;
            System.out.printf("Середнє арифметичне чисел після першого від’ємного: %.2f%n", average);
        }
    }
}
