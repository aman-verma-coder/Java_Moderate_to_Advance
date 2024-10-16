public class _28p7_findPermutaion {
    public static void findPermutaion(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // rescursion
        for (int i = 0; i < str.length(); i++) {
            char currStr = str.charAt(i);
            // "abcde"=>"ab"+"de"="abde"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutaion(newStr, ans + currStr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutaion(str, "");
    }
}