package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int sum = 0;
        if (arraySize <= 0) {
            System.out.println("Массив нулевого размера");
        } else {
            int i = 0;
            while (i < arraySize) {
                array[i] = scanner.nextInt();
                i++;
            }
            for (int element : array) {
                if (element % 2 == 0) {
                    sum += element;
                }
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
