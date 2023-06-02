package org.cycles;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int friendCount = scanner.nextInt();
        int total = (int) (sum * 1.1);
        if (sum < 0 ) {
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
        } else if (friendCount <= 0) {
            System.out.println("Кто здесь?!");
        } else {
            System.out.println((total / friendCount));
        }
        scanner.close();
    }
}
