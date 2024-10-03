public class _28p14_gridWaysTrick {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int ans = (factorial(m - 1 + n - 1)) / ((factorial(m - 1) * factorial(n - 1)));
        System.out.println(ans);// time complexity is O(n)
    }
}