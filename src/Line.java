public class Line {
    Point pos1;
    Point pos2;

    Line(Point point1, Point point2) {
        pos1 = point1;
        pos2 = point2;
    }

    double length() {
        return Math.sqrt(Math.pow((this.pos1.x - this.pos2.x), 2) +
                Math.pow((this.pos1.y - this.pos2.y), 2));
    }
}

