public class _23p5_constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 91);
        System.out.println("Name: " + s1.name + " Roll: " + s1.rollNo);
        Demo d1 = new Demo();
    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Demo {
    Demo() {
        System.out.println("Constructor called");
    }
}