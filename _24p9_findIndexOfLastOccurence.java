public class _24p9_findIndexOfLastOccurence {
    public static int findIdxOfLastOccu(int[] arr, int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }
        int isFound = findIdxOfLastOccu(arr, idx + 1, key);
        if (isFound == -1 && arr[idx] == key) {
            return idx;
        } else {
            return isFound;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 10 };
        int key = 5;
        System.out.println(findIdxOfLastOccu(arr, 0, key));
    }
}