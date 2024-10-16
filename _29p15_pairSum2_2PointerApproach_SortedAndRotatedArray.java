import java.util.ArrayList;

public class _29p15_pairSum2_2PointerApproach_SortedAndRotatedArray {
    public static boolean pairSum(ArrayList<Integer> nums, int target) {
        int n = nums.size();
        int bp = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int rp = bp;
        int lp = bp + 1;
        while (lp != rp) {
            if ((nums.get(lp) + nums.get(rp)) == target) {
                System.out.println(nums.get(lp) + " + " + nums.get(rp) + " = " + target);
                return true;
            } else if ((nums.get(lp) + nums.get(rp)) > target) {
                rp = (n + rp - 1) % n;
            } else {
                lp = (lp + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(15);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        int target = 16;
        System.out.println(pairSum(nums, target));
    }
}