public class Triangle extends Shape {
    double a, b, c;
    Triangle(int color, double a, double b, double c) {
        super(ShapeType.Triangle, color);
        a = a;
        b = b;
        c = c;
    }

    double getPerimiter() {
        return a + b + c;
    }

    double getSquare () {
        double p = getPerimiter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
