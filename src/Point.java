public class Point {
    double x, y;
    public static int count = 0;

    Point() {
        x = 0;
        y = 0;
        count++;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
        count++;
    }

    double length(Point another) {
        return Math.sqrt(Math.pow((another.x - this.x), 2) +
                Math.pow((another.y - this.y), 2));
    }

    static Point[] maxLength(Point[] arr) {
        double l = 0;
        int ii = 0, jj = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i].length(arr[j]) > l) {
                    ii = i;
                    jj = j;
                    l = arr[i].length(arr[j]);
                }
            }
        }
        return new Point[]{arr[ii], arr[jj]};
    }

    public String toString() {
        return this.x + " " + this.y;
    }
}
