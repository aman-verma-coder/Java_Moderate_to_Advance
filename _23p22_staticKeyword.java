public class _23p22_staticKeyword {
    public static void main(String[] args) {
        Student5 st1 = new Student5();
        st1.schoolName = "HCKJV";
        Student5 st2 = new Student5();
        System.out.println(st2.schoolName);
        Student5 st3 = new Student5();
        st3.schoolName = "JCIR";
        System.out.println(st1.schoolName);
    }
}

class Student5 {
    String name;
    int rollNo;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setRoll(int rollNo) {
        this.rollNo = rollNo;
    }

    int getRoll() {
        return this.rollNo;
    }
}