public class _24p6_printSumOfNNaturalNos {
    public static int sumOfNNaturalNos(int n) {
        if (n == 1) {
            return 1;
        } else {
            int sum = n + sumOfNNaturalNos(n - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfNNaturalNos(n));
    }
}