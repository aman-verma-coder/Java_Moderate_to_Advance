import java.util.ArrayList;

public class _29p5_findMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5001);
        nums.add(5);
        nums.add(19);
        nums.add(106);
        Integer max = Integer.MIN_VALUE;
        for (Integer i = 0; i < nums.size(); i++) {
            max = Math.max(nums.get(i), max);
        }
        System.out.println("Maximum Value: " + max);
    }
}