public class PowerFunction {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println("pow(" + x + ", " + n + ") = " + pow(x, n));
    }

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double half = pow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            if (n > 0) {
                return half * half * x;
            } else {
                return half * half / x;
            }
        }
    }
}
