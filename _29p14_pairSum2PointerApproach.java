import java.util.ArrayList;

public class _29p14_pairSum2PointerApproach {
    public static boolean pairSum(ArrayList<Integer> nums, int target) {
        int lp = 0;
        int rp = nums.size() - 1;
        while (lp < rp) {
            if (nums.get(lp) + nums.get(rp) == target) {
                System.out.println(nums.get(lp) + " + " + nums.get(rp) + " = " + target);
                return true;
            } else if (nums.get(lp) + nums.get(rp) > target) {
                rp--;
            } else {
                lp++;
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
        int target = 6;
        System.out.println(pairSum(nums, target));
    }
}