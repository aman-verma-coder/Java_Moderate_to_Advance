public class _25p8_practiceQs2 {
    public static void writeNumToWords(int num) {
        if (num == 0) {
            return;
        }
        String[] numInWords = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        int lastDigit = num % 10;
        writeNumToWords(num / 10);
        System.out.print(numInWords[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int num = 2024;
        writeNumToWords(num);
    }
}