package org.example;

import java.io.IOException;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int daySpeed = a - b;
        if (a >= h) {
            System.out.println(1);
        } else if (daySpeed <= 0) {
            System.out.println("Никогда");
        } else {
            int days = 0;
            for (int path = 0; path <= h; path = daySpeed * days + a) {
                days++;
            }
            System.out.println(days);
        }
        scanner.close();
    }

}
