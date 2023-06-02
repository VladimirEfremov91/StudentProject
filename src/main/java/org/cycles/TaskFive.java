package org.cycles;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // Инициализация максимального значения

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Прерываем цикл, если введено 0
            }

            if (number > max) {
                max = number; // Обновляем максимальное значение, если введенное число больше текущего максимума
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
