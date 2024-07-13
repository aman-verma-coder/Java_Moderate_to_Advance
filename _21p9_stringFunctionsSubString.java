public class _21p9_stringFunctionsSubString {
    public static String substring(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("By function: " + substring(str, 0, 4));
        System.out.println("By inbuilt function: " + str.substring(0, 4));
    }
}