package org.example;

import java.io.IOException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int strangerCount = scanner.nextInt();
        if (strangerCount < 0) {
            System.out.println("Серьезно? А что так негативно?");
        } else if (strangerCount == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else {
            while (scanner.hasNext()) {
                System.out.println("Привет, " + scanner.next());
            }
        }
        scanner.close();
    }
}