import java.util.ArrayList;

public class _29p11_containerWithMostWater2PointerApproach {
    public static int mostWater(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size() - 1;
        int water = 0;
        while (lp < rp) {
            water = Math.max(water, (Math.min(height.get(lp), height.get(rp))) * (rp - lp));
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else if (height.get(lp) > height.get(rp)) {
                rp--;
            } else {
                break;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mostWater(height));
    }
}