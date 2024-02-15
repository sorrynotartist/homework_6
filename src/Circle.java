public class Circle extends Shape {
    double r;
    Point center;

    Circle(int color, Point center, double r) {
        super(ShapeType.Circle, color);
        this.center = center;
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }

    public double getSquare() {
        return Math.PI * Math.pow(this.r, 3);
    }
}
