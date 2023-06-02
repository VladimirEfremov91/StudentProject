package org.cycles;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personCount = scanner.nextInt();
        int sliceCount = scanner.nextInt();
        int pizzaCount = 1;
        while (true) {
            if (sliceCount * pizzaCount % personCount == 0) {
                break; //
            }
            pizzaCount++;
        }
        System.out.println(pizzaCount);
        scanner.close();
    }
}
