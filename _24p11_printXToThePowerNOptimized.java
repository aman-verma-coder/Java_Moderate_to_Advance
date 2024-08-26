public class _24p11_printXToThePowerNOptimized {
    public static int xPowNOptimized(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow = xPowNOptimized(x, n / 2);
        int halfPowSqr = halfPow * halfPow;
        if (n % 2 != 0) {
            return halfPowSqr * x;
        } else {
            return halfPowSqr;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 11;
        System.out.println(xPowNOptimized(x, n));
    }
}