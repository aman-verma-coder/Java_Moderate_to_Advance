public class _24p8_findIndexOfFirstOccurence {
    public static int findIdxOfFirstOccu(int[] arr, int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        } else {
            return findIdxOfFirstOccu(arr, idx + 1, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 6;
        System.out.println(findIdxOfFirstOccu(arr, 0, key));
    }
}