public class _23p1_classAndObjects {
    public static void main(String[] args) {
        Pen pen1 = new Pen();// Created a new pen object named as pen1
        pen1.setColor("Green");
        System.out.println(pen1.color);
        pen1.setTip(6);
        System.out.println(pen1.tip);
        pen1.setColor("Blue");
        System.out.println(pen1.color);
        pen1.color = "Yellow";
        System.out.println(pen1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newSTip) {
        tip = newSTip;
    }
}