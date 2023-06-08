package org.classes.tasktwo;

public class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        double lenAB = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) - Math.pow((b.getY() - a.getY()), 2));
        double lenBC = Math.sqrt(Math.pow((c.getX() - b.getX()), 2) - Math.pow((c.getY() - b.getY()), 2));
        double lenCA = Math.sqrt(Math.pow((a.getX() - c.getX()), 2) - Math.pow((a.getY() - c.getY()), 2));
        if (lenCA == lenAB + lenBC || lenAB == lenCA + lenBC || lenBC == lenAB + lenCA) {
            System.out.println("Треугольник не существует");
            return;
        }
    }

    public double area() {
        //Напишите свой код здесь
    }
}
