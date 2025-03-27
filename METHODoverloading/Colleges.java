public class Colleges {

    
    public static void display(String collegeName) {
        System.out.println("College Name: " + collegeName);
    }

 
 static void display(String collegeName, String location) {
        System.out.println("College Name: " + collegeName + ", Location: " + location);
    }

  static void display(String collegeName, String location, int rank) {
        System.out.println("College Name: " + collegeName + ", Location: " + location + ", Rank: " + rank);
    }

    public static void main(String[] args) {
        // Calling overloaded static methods
        Colleges.display("ABC College");
        Colleges.display("XYZ College", "New York");
        Colleges.display("LMN College", "California", 5);
    }
}
