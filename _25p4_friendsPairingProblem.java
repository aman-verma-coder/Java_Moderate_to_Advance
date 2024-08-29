public class _25p4_friendsPairingProblem {
    public static int friendsPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = friendsPair(n - 1);
        // pair
        int fnm2 = (n - 1) * friendsPair(n - 2);
        return fnm1 + fnm2;
        // return friendsPair(n - 1) + (n - 1) * friendsPair(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPair(n));
    }
}