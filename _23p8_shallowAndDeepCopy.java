public class _23p8_shallowAndDeepCopy {
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        s1.name = "Aman";
        s1.roll = 91;
        s1.password = "asdf";
        s1.marks[0] = 99;
        s1.marks[1] = 90;
        s1.marks[2] = 85;
        Student4 s2 = new Student4(s1);
        s2.password = "qazwsx";
        s1.marks[1] = 96;
        s2.marks[2] = 88;
        for (int i = 0; i < (s1.marks).length; i++) {
            System.out.println("S1 marks: " + s1.marks[i]);
        }
        for (int i = 0; i < (s2.marks).length; i++) {
            System.out.println("S2 marks: " + s2.marks[i]);
        }
    }
}

class Student4 {
    String name;
    int roll;
    String password;
    int marks[];

    // Student4(Student4 s1) {// Shallow Copied Constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    Student4(Student4 s1) {// Deep Copied Constructor
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for (int i = 0; i < marks.length; i++) {
    this.marks[i] = s1.marks[i];
    }
    }

    Student4() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    Student4(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student4(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}