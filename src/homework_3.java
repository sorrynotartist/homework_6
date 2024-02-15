public class homework_3 {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(sumDigits(5));
        System.out.println(arraySum(new double[]{5, 8, 18, 2, 12, 48, 1, -2}));
        System.out.println(arrayCount(new int[]{5, 4, 8, 2, 3, 45, 26}));
        System.out.println(indexOf(new int[]{15, 5, 75, 4, 6}, 75));
        System.out.println(averageColumn(
                new double[][]{
                        {1, 2, 3, 5, 25},
                        {1, 2, 3, 5, 8},
                        {1, 2, 3, 6, 74}
                }, 4)
        );
        System.out.println(diagonalAverage(new double[][]{
                        {1, 2, 3},
                        {1, 7, 3},
                        {1, 2, 4}},
                2));
        System.out.println(countPositive(new int[][]{
                {3, 5, 2},
                {3, 2, 1},
                {4, 8, 9}}
        ));

    }

    static int factorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    static int sumDigits(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x + sumDigits(x - 1);
        }
    }

    private static double arraySum(double[] x) {
        double min = x[0];
        for (int k = 0; k < x.length; k++) {
            if (x[k] < min) {
                min = x[k];
            }
        }
        double max = x[0];
        for (int s = 0; s < x.length; s++) {
            if (x[s] > max) {
                max = x[s];
            }
        }
        return max + min;
    }

    private static int arrayCount(int[] x) {
        int iriska = 0;
        for (int m = 0; m < x.length; m++) {
            if (x[m] % 2 == 0) {
                iriska++;
            }
        }
        return iriska;
    }

    private static int indexOf(int[] arr, int x) {
        for (int v = 0; v < arr.length; v++) {
            if (arr[v] == x) {
                return v;
            }
        }
        return -1;
    }

    private static double averageColumn(double[][] arr, int x) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][x];
        }
        return sum / arr.length;
    }

    private static double diagonalAverage(double[][] fuck, double x) {
        double sum = 0;
        for (int i = 0; i < fuck.length; i++) {
            for (int j = 0; j < fuck.length; j++) {
                if (i == j) {
                    sum += fuck[i][j];
                }
            }
        }
        return sum / fuck.length;
    }

    private static int countPositive(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length -1; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    sum--;
                    break;
                }
            }
            sum++;
        }
        return sum;
    }
}




