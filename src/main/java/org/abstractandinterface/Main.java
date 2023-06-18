package org.abstractandinterface;

public class Main {
    public static void main(String[] args){
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        Quadrilateral qu = new Quadrilateral(new Point(1, 0), new Point(2, 1), new Point(1, 2), new Point(0, 1));
        Circle ci = new Circle(new Point(1, 1), 3);

        System.out.println(tr.area());
        System.out.println(qu.area());
        System.out.println(ci.area());

        System.out.println(tr.pointsToString());
        System.out.println(qu.pointsToString());
        System.out.println(ci.pointsToString());
    }
}
