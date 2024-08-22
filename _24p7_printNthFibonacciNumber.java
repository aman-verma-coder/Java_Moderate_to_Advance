public class _24p7_printNthFibonacciNumber {
    public static int printNthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            int fibnm1 = printNthFibonacci(n - 1);
            int fibnm2 = printNthFibonacci(n - 2);
            int fibn = fibnm1 + fibnm2;
            return fibn;
        }
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(printNthFibonacci(n));
    }
}