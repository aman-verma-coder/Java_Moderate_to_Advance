import java.util.ArrayList;

public class _29p3_sizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Size of ArrayList: "+nums.size());
        for (Integer i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " ");
        }
    }
}