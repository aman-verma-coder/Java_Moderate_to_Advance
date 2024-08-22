public class _24p4_printNumsInIncreasingOrder {
    public static void main(String[] args) {
        int n = 10;
        increasingNoPrint(n);
    }

    public static void increasingNoPrint(int n) {
        if (n == 1) {
            System.out.print(n + " ");
        } else {
            increasingNoPrint(n - 1);
            System.out.print(n + " ");
        }
    }
}