public class _26p7_sortedAndRotatedArraySearch {
    public static int sortedArraySearch(int[] arr, int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }
        int mid = (ei + si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (target >= arr[si] && target <= arr[mid]) {
                return sortedArraySearch(arr, si, mid, target);
            } else {
                return sortedArraySearch(arr, mid + 1, ei, target);
            }
        } else {
            if (target >= arr[mid] && target <= arr[ei]) {
                return sortedArraySearch(arr, mid + 1, ei, target);
            } else {
                return sortedArraySearch(arr, si, mid, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(sortedArraySearch(arr, 0, arr.length - 1, 6));
    }
}