import java.util.ArrayList;

public class _29p6_swapTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(3);
        num.add(6);
        System.out.println("Before Swapping: " + num);
        int temp = num.get(1);
        num.set(1, num.get(3));
        num.set(3, temp);
        System.out.println("After Swapping: " + num);
    }
}