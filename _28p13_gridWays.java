public class _28p13_gridWays {
    public static int gridWays(int m, int n, int x, int y) {
        if (x == m - 1 && y == n - 1) {// base case
            return 1;
        } else if (x == m || y == n) {// boundary cross condition
            return 0;
        }
        int w1 = gridWays(m, n, x + 1, y);
        int w2 = gridWays(m, n, x, y + 1);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(gridWays(m, n, 0, 0));
    }
}