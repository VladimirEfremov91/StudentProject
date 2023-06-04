package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        if (arraySize < 2) {
            System.out.println("Не подходит");
        } else {
            int i = 0;
            while (i < arraySize) {
                array[i] = scanner.nextInt();
                i++;
            }
            scanner.close();
            boolean[] checker = new boolean[arraySize];
            checker[0] = false;
            checker[1] = false;
            int y = 2;
            while (y < arraySize) {
                int a = array[y];
                int b = array[y-1] + array[y-2];
                checker[y] = a == b;
                y++;
            }
            System.out.println(Arrays.toString(checker));
        }

    }
}
