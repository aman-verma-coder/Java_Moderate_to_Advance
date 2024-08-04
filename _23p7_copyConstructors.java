public class _23p7_copyConstructors {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.name = "Aman";
        s1.roll = 91;
        s1.password = "asdf";
        s1.marks[0] = 99;
        s1.marks[1] = 90;
        s1.marks[2] = 85;
        Student3 s2 = new Student3(s1);
        s2.password = "qazwsx";
        s1.marks[2] = 92;
        for (int i = 0; i < (s1.marks).length; i++) {
            System.out.println("S1 marks: " + s1.marks[i]);
        }
        for (int i = 0; i < (s2.marks).length; i++) {
            System.out.println("S2 marks: " + s2.marks[i]);
        }
    }
}

class Student3 {
    String name;
    int roll;
    String password;
    int marks[];

    Student3(Student3 s1) {// Copied Constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student3() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    Student3(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student3(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}