public class _24p5_findFactorialOfN {
    public static int findFact(int n) {
        if (n == 0) {
            return 1;
        } else {
            // int fnm1=findFact(n-1);
            int fn = n * findFact(n - 1);
            return fn;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFact(6));
    }
}