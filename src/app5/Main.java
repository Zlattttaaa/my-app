import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 4;
        int[][] matrix = new int[size][size];
        Random rand = new Random();

        // Заповнення матриці випадковими числами (1–50)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(50) + 1;
            }
        }

        // Вивід матриці
        System.out.println("Матриця " + size + "x" + size + ":");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Суми рядків
        int sumEvenRows = 0;
        int sumOddRows = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0)
                    sumEvenRows += matrix[i][j];
                else
                    sumOddRows += matrix[i][j];
            }
        }

        // Добутки стовпців
        long productEvenCols = 1;
        long productOddCols = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j % 2 == 0)
                    productEvenCols *= matrix[i][j];
                else
                    productOddCols *= matrix[i][j];
            }
        }

        // Вивід результатів
        System.out.println("\nСума елементів у парних рядках (0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (0, 2): " + productEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (1, 3): " + productOddCols);

        // Перевірка на магічний квадрат
        boolean isMagic = true;
        int magicSum = 0;

        // Сума першого рядка — еталон
        for (int j = 0; j < size; j++) {
            magicSum += matrix[0][j];
        }

        // Перевірка рядків
        for (int i = 1; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        // Перевірка стовпців
        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        // Перевірка діагоналей
        int mainDiag = 0;
        int secDiag = 0;
        for (int i = 0; i < size; i++) {
            mainDiag += matrix[i][i];
            secDiag += matrix[i][size - 1 - i];
        }
        if (mainDiag != magicSum || secDiag != magicSum) {
            isMagic = false;
        }

        // Висновок
        if (isMagic)
            System.out.println("\nМатриця є магічним квадратом.");
        else
            System.out.println("\nМатриця не є магічним квадратом.");
    }
}

