public class _22p17_checkNIsPowerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n) {
        return ((n) & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));
    }
}