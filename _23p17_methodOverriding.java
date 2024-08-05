public class _23p17_methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal5 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Deer extends Animal5 {
    void eat() {
        System.out.println("Deer is grazing");
    }
}