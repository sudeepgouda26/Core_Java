 class Jspider {
    public static void main(String[] args) {
        Cours c1 = new Cours();
        Student.userStudent(c1);
    }
}

public class Cours {

    void course() {
        System.out.println("Java");
    } 

}

class Student {

    static void userStudent(Cours c2) {
        c2.course();
    }
}
