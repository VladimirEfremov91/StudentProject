package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[line][column];
        int i = 1;
        int c = 0;
        while (c < column) {
            array[0][c] = i;
            c++;
            i++;
        }
        int l = 0;
        while (l < line) {
            array[l+1][c] = i;
            l++;
            i++;
        }
        while (c == 0) {
            array[l][c-1] = i;
            i++;
            c--;
        }

    }
}
