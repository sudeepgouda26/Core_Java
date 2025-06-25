public class ConstructorChaining extends B {
    String Name;
    int age;

    ConstructorChaining() {
      super("engineer", "California"); // Calling the constructor of class B
    }

public static void main(String[] args) {
 ConstructorChaining person = new ConstructorChaining();
    System.out.println("Job: " + person.Job);
    System.out.println("Address: " + person.Adress);
       
}
}

