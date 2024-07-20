public class _22p14_updateithBit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit1(int n, int i, int newBit) {
        if (newBit == 0) {
            return (clearIthBit(n, i));
        } else {
            return (setIthBit(n, i));
        }
    }

    public static int updateIthBit2(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return (n | BitMask);
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit1(10, 2, 1));
        System.out.println(updateIthBit2(10, 2, 1));
    }
}