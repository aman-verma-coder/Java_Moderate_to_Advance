public class _21p8_stringFunctionsCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        if (str1 == str2) {
            System.out.println("1 str1 and str2 are same");
        } else {
            System.out.println("2 str1 and str2 are not same");
        }
        if (str1 == str3) {
            System.out.println("3 str1 and str3 are same");
        } else {
            System.out.println("4 str1 and str3 are not same");
        }
        if (str1.equals(str3)) {
            System.out.println("5 str1 and str3 are same");
        } else {
            System.out.println("6 str1 and str3 are not same");
        }
    }
}