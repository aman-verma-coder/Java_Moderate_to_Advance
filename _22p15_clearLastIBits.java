public class _22p15_clearLastIBits {
    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastIBits(15, 2));
    }
}