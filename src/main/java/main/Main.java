package main;

public class Main {

    public final static double EPS = 1e-9;

    public double mySin(double x) {
        double sum = 0;
        double a = x;
        int n = 0;
        while (Math.abs(a) > EPS) {
            sum += a;
            n++;
            a = -a * x * x / ((2*n)*(2*n+1));
        }
        return sum;
    }

    public double myCos(double x) {
        double sum = 0;
        double a = 1;
        int n = 0;
        while (Math.abs(a) > EPS) {
            sum += a;
            n++;
            a = -a * x * x / ((2*n-1)*(2*n));
        }
        return sum;
    }
}
// sin
// 1  - 2,3   (2*n)*(2*n+1)
// 2  - 4,5   (2*n)*(2*n+1)
// 3  - 6,7

// cos
// 1  - 1,2      (2*n-1)(2*n)
// 2  - 3,4
// 3  - 5,6