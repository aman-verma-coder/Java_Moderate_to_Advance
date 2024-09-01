public class _25p8_practiceQs4 {
    public static void contiguousSubstrings(String str, int idx) {
        if (idx == str.length()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = idx; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (sb.charAt(0) == sb.charAt(sb.length() - 1)) {
                System.out.println(sb.toString());
            }
        }
        contiguousSubstrings(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abcab";
        contiguousSubstrings(str, 0);
    }
}