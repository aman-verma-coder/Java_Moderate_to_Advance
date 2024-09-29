public class _28p5_findSubsets {
    public static void findSubset(String str, String ans, int idx) {
        // base case
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Empty subset");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes choice
        findSubset(str, ans + str.charAt(idx), idx + 1);
        // No choice
        findSubset(str, ans, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}