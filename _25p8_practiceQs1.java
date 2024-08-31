public class _25p8_practiceQs1 {
    public static void indexesOfKey(int[] arr, int key, int idx) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        indexesOfKey(arr, key, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 8, 1, 9, 5, 4, 7, 5, 3 };
        int key = 4;
        indexesOfKey(arr, key, 0);
    }
}