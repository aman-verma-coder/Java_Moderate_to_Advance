public class _21p6_checkPalindromeString {
    public static void checkPalindromeString(String str) {
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = false;
            }
        }
        if (result == true) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }

    public static void main(String[] args) {
        String str = "racecar";
        checkPalindromeString(str);
    }
}