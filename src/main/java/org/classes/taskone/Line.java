package org.classes.taskone;

public class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        }
        if (this.k == other.k && this.b == other.b) {
            return null;
        }
        int x = (other.b - this.b) / (this.k - other.k);
        int y = k * x + b;
        return new Point(x, y);
    }
}
