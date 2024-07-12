public class _21p7_shortestPath {
    public static void shortestPath(String str) {
        int West = 0, East = 0, North = 0, South = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                West++;
            } else if (str.charAt(i) == 'E') {
                East++;
            } else if (str.charAt(i) == 'N') {
                North++;
            } else if (str.charAt(i) == 'S') {
                South++;
            } else {
                System.out.println("Invalid direction character: " + str.charAt(i));
            }
        }
        int netX = Math.abs(West - East);
        int netX2 = West - East;
        int netY = Math.abs(North - South);
        int netY2 = North - South;
        int shortestPath = (int) Math.sqrt(netX * netX + netY * netY);
        System.out.println("Shortest Path: " + shortestPath);
        if (netX2 < 0 && netY2 < 0) {
            System.out.println("Dirction: South-East");
        } else if (netX2 > 0 && netY2 < 0) {
            System.out.println("Dirction: South-West");
        } else if (netX2 < 0 && netY2 > 0) {
            System.out.println("Dirction: North-East");
        } else if (netX2 > 0 && netY2 > 0) {
            System.out.println("Dirction: North-West");
        } else {
            System.out.println("Not specified");
        }
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortestPath(str);
    }
}