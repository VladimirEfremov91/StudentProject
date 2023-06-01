package org.example;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Инициализация среднего значения
        int i = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Прерываем цикл, если введено 0
            }
            sum += number;
            i++;
        }
        System.out.println((int) Math.floor(sum / i));
        scanner.close();
    }
}
