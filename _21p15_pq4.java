import java.util.Arrays;
import java.util.Scanner;

public class _21p15_pq4 {
    public static void checkAnagramString(String str1, String str2) {
        boolean result = false;
        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char str11[] = str1.toCharArray();
            char str22[] = str2.toCharArray();
            Arrays.sort(str11);
            Arrays.sort(str22);
            result = Arrays.equals(str11, str22);
        }
        if (result == true) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        checkAnagramString(str1, str2);
        sc.close();
    }
}