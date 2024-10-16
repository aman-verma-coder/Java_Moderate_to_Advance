public class _23p6_typesOfConstructors {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Aman");
        Student2 s3 = new Student2(91);
    }
}

class Student2 {
    String name;
    int rollNo;

    Student2() {//Non-Parameterized
        System.out.println("Constructor called");
    }

    Student2(String name) {//Parameterized
        System.out.println("Name: " + name);
    }

    Student2(int rollNo) {//Parameterized
        System.out.println("Roll no.: " + rollNo);
    }
}