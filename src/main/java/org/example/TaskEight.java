package org.example;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("без корней");
        } else if (discriminant == 0) {
            System.out.println(-b / (2 * a));
        } else if (discriminant > 0) {
            double first = (- b - Math.sqrt(discriminant) / (2 * a));
            double second = (- b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(Math.min(first, second) + " " + Math.max(first, second));
        }
        scanner.close();
    }
}
