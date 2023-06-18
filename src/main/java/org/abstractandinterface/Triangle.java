package org.abstractandinterface;

public class Triangle extends Figure {
    Point a, b, c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        return 0.5 * Math.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY()));
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")(" + b.getX() + "," + b.getY() + ")(" + c.getX() + "," + c.getY() + ")";
    }
}
