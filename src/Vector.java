public class Vector extends Line {
    Vector(Point point1, Point point2) {
        super(point1, point2);
    }
    Vector(Line line) {
        super(line.pos1, line.pos2);
    }
    Vector startFrom (Point pos1) {
        double x = this.pos2.x - this.pos1.x;
        double y = this.pos2.y - this.pos1.y;
        return new Vector (pos1, new Point(pos1.x + x,pos1.y + y));
    }

    Vector scalarSum (Vector another) {
        Vector result = another.startFrom(pos2);
        return new Vector(new Line(this.pos1, result.pos2));
    }

    Vector scalarSum2 (Vector another) {
        Point point1 = new Point(this.pos1.x + another.pos1.x, this.pos1.y + another.pos1.y);
        Point point2 = new Point(this.pos2.x + another.pos2.x, this.pos2.y + another.pos2.y);
    return new Vector(point1, point2);
    }
}
