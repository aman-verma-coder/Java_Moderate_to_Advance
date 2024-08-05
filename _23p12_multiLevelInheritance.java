public class _23p12_multiLevelInheritance {
    public static void main(String[] args) {
        Dog2 tommy = new Dog2();
        tommy.eat();
        tommy.breath();
        tommy.legs = 4;
        System.out.println("Tommy has " + tommy.legs + " legs");
        tommy.bark();
    }
}

class Animal2 {
    String color;

    void eat() {
        System.out.println("Eating...");
    }

    void breath() {
        System.out.println("Breathing...");
    }
}

class Mammals extends Animal2 {//Single Level Inheritance
    int legs;
}

class Dog2 extends Mammals {//Multi Level Inheritance
    void bark() {
        System.out.println("Barking...");
    }
}