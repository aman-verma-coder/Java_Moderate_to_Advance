import java.util.ArrayList;

public class _29p13_pairSumBruteForce {
    public static boolean pairSum(ArrayList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    System.out.println(nums.get(i) + " + " + nums.get(j) + " = " + target);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        int target = 5;
        System.out.println(pairSum(nums, target));
    }
}