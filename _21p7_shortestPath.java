import java.util.Scanner;

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
        int netX = (int) Math.abs(West - East);
        int netX2 = West - East;
        int netY = (int) Math.abs(North - South);
        int netY2 = North - South;
        Float shortestPath = (float) Math.sqrt(netX * netX + netY * netY);
        System.out.println("Shortest Path: " + shortestPath);
        if (netX2 < 0 && netY2 < 0) {
            System.out.println("Dirction: South-East");
        } else if (netX2 < 0 && netY2 == 0) {
            System.out.println("Dirction: East");
        } else if (netX2 > 0 && netY2 < 0) {
            System.out.println("Dirction: South-West");
        } else if (netX2 > 0 && netY2 == 0) {
            System.out.println("Dirction: West");
        } else if (netX2 < 0 && netY2 > 0) {
            System.out.println("Dirction: North-East");
        } else if (netX2 == 0 && netY2 > 0) {
            System.out.println("Dirction: North");
        } else if (netX2 > 0 && netY2 > 0) {
            System.out.println("Dirction: North-West");
        } else if (netX2 == 0 && netY2 < 0) {
            System.out.println("Dirction: South");
        } else {
            System.out.println("Not specified");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directions (W, E, N, S): ");
        String str = sc.next();
        shortestPath(str);
        sc.close();
    }
}