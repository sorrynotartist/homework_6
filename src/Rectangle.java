public class Rectangle extends Shape {

    double a, b;

    Rectangle(double a, double b, int color) {
        super(ShapeType.Rectangle, color);
        a = a;
        b = b;
    }

    double getPerimiter() {
        return a * 2 + b * 2;
    }

    double getSquare () {
        return a * b;
    }
}