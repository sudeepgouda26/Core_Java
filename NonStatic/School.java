public class School {
     static String  S_name = "Sdit";
     int strength = 1000;
     char grade = 'C';
     public static void main(String[] args) {
        System.out.println("School Name: "+S_name);
        School s1 = new School();
        s1.strength= 2000;
        s1.grade = 'A';
        System.out.println("Strength: "+s1.strength);
        System.out.println("Grade: "+s1.grade);
     }

}
