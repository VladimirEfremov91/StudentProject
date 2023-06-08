package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        int value = 1; // Начальное значение для заполнения массива
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftColumn = 0;
        int rightColumn = columns - 1;

        while (value <= rows * columns) {
            // Заполнение верхней строки
            for (int i = leftColumn; i <= rightColumn; i++) {
                array[topRow][i] = value++;
            }
            topRow++;

            // Заполнение правого столбца
            for (int i = topRow; i <= bottomRow; i++) {
                array[i][rightColumn] = value++;
            }
            rightColumn--;

            // Заполнение нижней строки
            for (int i = rightColumn; i >= leftColumn; i--) {
                array[bottomRow][i] = value++;
            }
            bottomRow--;

            // Заполнение левого столбца
            for (int i = bottomRow; i >= topRow; i--) {
                array[i][leftColumn] = value++;
            }
            leftColumn++;
        }
        System.out.println(Arrays.toString(array));

        // Вывод двумерного массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
