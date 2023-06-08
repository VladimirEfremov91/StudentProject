package org.classes.tasktwo;

import org.classes.tasktwo.Triangle;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Point c = new Point(x3, y3);
        Triangle abc = new Triangle(a, b, c);
        double lenAB = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) - Math.pow((b.getY() - a.getY()), 2));
        double lenBC = Math.sqrt(Math.pow((c.getX() - b.getX()), 2) - Math.pow((c.getY() - b.getY()), 2));
        double lenCA = Math.sqrt(Math.pow((a.getX() - c.getX()), 2) - Math.pow((a.getY() - c.getY()), 2));
        if (lenCA >= lenAB + lenBC || lenAB >= lenCA + lenBC || lenBC >= lenAB + lenCA) {
            System.out.println("Треугольник не существует");
        } else {
            System.out.println(abc.area());
        }
    }
}
