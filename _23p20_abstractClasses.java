public class _23p20_abstractClasses {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);
        // Animal a=new Animal();
        Mustang m = new Mustang();// Animal-> Horse-> Mustang
    }
}

abstract class Animal6 {
    String color;

    Animal6() {
        // color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal6 {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "black";
    }

    void walk() {
        System.out.println("Walking with 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

// class Chicken extends Animal6 {
// void changeColor() {
// color = "yellow";
// }

// void walk() {
// System.out.println("Walking with 2 legs");
// }
// }