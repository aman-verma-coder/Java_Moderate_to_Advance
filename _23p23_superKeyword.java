public class _23p23_superKeyword {
    public static void main(String[] args) {
        Horse2 h = new Horse2();
        System.out.println(h.color);
    }
}

class Animal7 {
    String color;

    Animal7() {
        System.out.println("Animal constructor is called");
    }
}

class Horse2 extends Animal7 {
    Horse2() {
        // super();
        super.color = "Orange";
        System.out.println("Horse constructor is called");
    }
}