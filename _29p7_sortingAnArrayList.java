import java.util.*;

public class _29p7_sortingAnArrayList {
    public static void main(String[] args) {
        // Inbuilt method to sort an ArrayList
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(3);
        num.add(6);
        System.out.println("Before Sorting: " + num);
        Collections.sort(num);// Ascending order
        System.out.println("After Sorting(By default ascending order): " + num);
        Collections.sort(num, Collections.reverseOrder());// Descending order
        System.out.println("After Sorting(Descending Order): " + num);
    }
}