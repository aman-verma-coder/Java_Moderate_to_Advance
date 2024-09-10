public class _26p3_mergeSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;// (si+ei)/2
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int[] arr, int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copying temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        // printArr(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 25, 4, 8, 9, 3 };
        divide(arr, 0, arr.length - 1);
        printArr(arr);
    }
}