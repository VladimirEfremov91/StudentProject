package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        if (arraySize <= 0) {
            System.out.println("Массив нулевого размера");
        } else {
            int i = 0;
            while (i < arraySize) {
                array[i] = scanner.nextInt();
                i++;
            }
            Arrays.sort(array);
            System.out.println(array[arraySize-1]);
        }
        scanner.close();
    }
}
