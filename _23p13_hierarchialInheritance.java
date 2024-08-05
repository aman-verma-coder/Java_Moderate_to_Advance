public class _23p13_hierarchialInheritance {
    public static void main(String[] args) {
        Dog3 dobby = new Dog3();
        dobby.color = "White";
        System.out.println(dobby.color);
        dobby.eat();
        dobby.bark();
        Cat billa = new Cat();
        billa.breath();
        billa.eat();
        billa.meow();
        Fish macchhi = new Fish();
        macchhi.breath();
        macchhi.eat();
        macchhi.swim();
    }
}

class Animal3 {
    String color;

    void breath() {
        System.out.println("Breathing...");
    }

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog3 extends Animal3 {
    int legs;

    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal3 {
    int legs;

    void meow() {
        System.out.println("Meowing...");
    }
}

class Fish extends Animal3 {
    int fins;

    void swim() {
        System.out.println("Swimming...");
    }
}