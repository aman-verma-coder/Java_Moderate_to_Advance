public class _21p5_charAt {
    public static void print(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String str = "Aman Verma";
        print(str);
    }
}