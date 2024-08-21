public class _24p2_printNumsInDecreasingOrder {
    public static void main(String[] args) {
        int n = 10;
        decreasingNoPrint(n);
    }

    public static void decreasingNoPrint(int n) {
        if (n == 1) {
            System.out.println(n + " ");
        } else {
            System.out.print(n + " ");
            decreasingNoPrint(n - 1);
        }
    }

}