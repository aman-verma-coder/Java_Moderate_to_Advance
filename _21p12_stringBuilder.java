public class _21p12_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {// Time Complexity: O(n)
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}