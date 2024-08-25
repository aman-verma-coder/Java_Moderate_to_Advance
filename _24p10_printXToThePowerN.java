public class _24p10_printXToThePowerN {
    public static int xpown(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xpnm1 = xpown(x, n - 1);
        // int xpn = x * xpnm1;
        // return xpn;//It can be done using method also
        return x * xpown(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(xpown(x, n));
    }
}