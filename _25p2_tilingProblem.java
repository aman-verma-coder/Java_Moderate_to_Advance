public class _25p2_tilingProblem {
    public static int calculateWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = calculateWays(n - 1);
        int fnm2 = calculateWays(n - 2);
        return fnm1 + fnm2;
        // return calculateWays(n - 1) + calculateWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateWays(n));
    }
}