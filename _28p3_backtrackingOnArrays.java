public class _28p3_backtrackingOnArrays {
    public static void backtrack(int[] arr, int idx, int val) {
        // base case
        if (idx == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[idx] = val;
        backtrack(arr, idx + 1, val + 1);// fn calling
        arr[idx] = arr[idx] - 2;// backtracking step;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrack(arr, 0, 1);
        printArr(arr);
    }
}