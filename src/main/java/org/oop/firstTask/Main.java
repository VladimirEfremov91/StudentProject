package org.oop.firstTask;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String s = sc.next();

        System.out.println(Action.sum(a, a));
        System.out.println(Action.sum(a, b));
        System.out.println(Action.sum(s, a));
    }
}
