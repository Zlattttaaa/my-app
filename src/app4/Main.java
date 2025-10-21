package app4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        // 1. Заповнюємо масив випадковими числами від 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // 2. Виводимо початковий вигляд масиву
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

        // 3. Сортування вставкою (Insertion Sort)
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        // 4. Виводимо відсортований масив
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        // 5. Введення числа для пошуку
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        // 6. Бінарний пошук
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                index = mid;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 7. Результат пошуку
        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Числа " + target + " немає у масиві.");
        }

        scanner.close();
    }
}
