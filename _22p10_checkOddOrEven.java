public class _22p10_checkOddOrEven {
    public static void oddEven(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        oddEven(5);
        oddEven(16);
        oddEven(27);
        oddEven(38);
        oddEven(49);
    }
}