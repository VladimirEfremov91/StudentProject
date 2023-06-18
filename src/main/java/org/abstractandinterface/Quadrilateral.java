package org.abstractandinterface;

public class Quadrilateral extends Figure {
    Point a, b, c, d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return 0.5 * Math.abs((a.getX()*b.getY() + b.getX()*c.getY() + c.getX()*d.getY() + d.getX()*a.getY()) -
                (b.getX()*a.getY() + c.getX()*b.getY() + d.getX()*c.getY() + a.getX()*d.getY()));
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")(" + b.getX() + "," + b.getY() + ")(" + c.getX() + "," + c.getY() + ")(" + d.getX() + "," + d.getY() + ")";
    }
}
