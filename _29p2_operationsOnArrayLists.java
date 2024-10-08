import java.util.ArrayList;

public class _29p2_operationsOnArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        int a = nums.get(1);
        System.out.println(a);
        nums.remove(2);
        System.out.println(nums);
        nums.set(1, 10);
        System.out.println(nums);
        System.out.println(nums.contains(5));
        System.out.println(nums.contains(11));
        nums.add(1, 2);
        System.out.println(nums);
    }
}