package org.abstractandinterface;

public class Circle extends Figure {
    Point center;
    int i;
    public Circle(Point center, int i) {
        this.center = center;
        this.i = i;
    }

    @Override
    public double area() {
        return Math.PI * i * i;
    }

    @Override
    public String pointsToString() {
        return "(" + center.getX() + "," + center.getY() + ")";
    }
}
