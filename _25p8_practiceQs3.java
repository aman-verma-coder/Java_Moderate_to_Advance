public class _25p8_practiceQs3 {
    public static int findLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return findLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "Aman Verma";
        System.out.println(findLength(str));
    }
}