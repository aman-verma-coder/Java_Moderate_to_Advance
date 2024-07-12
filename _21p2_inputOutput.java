import java.util.Scanner;

public class _21p2_inputOutput {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);
        String str2 = new String("abcd");
        System.out.println(str2);
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello, " + name);
        String name2 = sc.nextLine();
        System.out.println("Hello, " + name2);
        sc.close();
    }
}