public class Constructor {
    String Name;
    int age;


    public static void main(String[] args) {
        Constructor person = new Constructor();

        person.Name = "John";
        person.age = 30;

        Constructor person2 = new Constructor();
        person2.Name = "Jane";
        person2.age = 25;
        System.out.println("Person 1: " + person.Name + ", Age: " + person.age);
        System.out.println("Person 2: " + person2.Name + ", Age: " + person2.age);
    }
    
}
