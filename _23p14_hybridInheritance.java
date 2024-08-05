public class _23p14_hybridInheritance {
    public static void main(String[] args) {
        Tuna tun = new Tuna();
        tun.size();
        Shark shar = new Shark();
        shar.swim();
        Peacock peac = new Peacock();
        peac.eat();
        peac.fly();
        peac.dance();
        Dog4 kutta = new Dog4();
        kutta.legs();
        kutta.bark();
        Cat2 billi = new Cat2();
        billi.breath();
        billi.meow();
        Human manushya = new Human();
        manushya.breath();
        manushya.eat();
        manushya.legs();
        manushya.talk();
    }
}

class Animal4 {
    String color;

    void breath() {
        System.out.println("Breathing...");
    }

    void eat() {
        System.out.println("Eating...");
    }
}

class Fish2 extends Animal4 {
    void swim() {
        System.out.println("Swimming...");
    }
}

class Tuna extends Fish2 {
    void size() {
        System.out.println("Size is 10 inches");
    }
}

class Shark extends Fish2 {
    void size() {
        System.out.println("Size is 200 inches");
    }
}

class Bird extends Animal4 {
    void fly() {
        System.out.println("Flying...");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("Dancing...");
    }
}

class Mammals2 extends Animal4 {
    void legs() {
        System.out.println("They have legs and they can walk & run");
    }
}

class Dog4 extends Mammals2 {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat2 extends Mammals2 {
    void meow() {
        System.out.println("Meowing...");
    }
}

class Human extends Mammals2 {
    void talk() {
        System.out.println("Talking...");
    }
}