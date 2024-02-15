
public class hm_5 {

    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(1, 0));
        Line line1 = new Line(new Point(1, 1), new Point(2, 2));
        Vector vector = new Vector(line);
        Vector vector1 = new Vector(line);
        System.out.println(vector.scalarSum(vector1));
    }
}
