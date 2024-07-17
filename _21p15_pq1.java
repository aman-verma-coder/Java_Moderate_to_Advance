import java.util.Scanner;

public class _21p15_pq1 {
    public static void lowercaseVowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of lowercase vowels in the string: " + str + " is " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        lowercaseVowelCount(str);
        sc.close();
    }
}
