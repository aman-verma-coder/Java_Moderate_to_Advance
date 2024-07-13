public class _21p10_largestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana", "orange", "grapes" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {// time complexity: (x*n)
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}