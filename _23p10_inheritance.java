public class _23p10_inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.breath();
        d1.bark();
        d1.noOfLegs(4);
    }
}

class Animal {//Base Class or Parent Class
    String color;

    void eat() {
        System.out.println("eating...");
    }

    void sleep() {
        System.out.println("sleeping...");
    }

    void breath() {
        System.out.println("breathing...");
    }

}

class Dog extends Animal {//Single Level Inheritance //Derived Class or Child Class
    int legs;

    void bark() {
        System.out.println("barking...");
    }

    void noOfLegs(int legs) {
        System.out.println("No. of legs: " + legs);
    }
}