public class _23p3_gettersAndSetters {
    public static void main(String[] args) {
        Pen2 pen1 = new Pen2();// Created a new pen object named as pen1
        pen1.setColor("Green");
        System.out.println(pen1.getColor());
        pen1.setTip(6);
        System.out.println(pen1.getTip());
        pen1.setColor("Yellow");
        System.out.println(pen1.getColor());
    }
}

class Pen2 {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newSTip) {
        tip = newSTip;
    }
}