public class Course {
    String courseName = "Java";
    static String institute = "jspiders";
    int cost =300000;
    public static void main(String[] args) {
        System.out.println("Course Name: " + institute);
        Course course = new Course();
        course.courseName = "Python";
        course.cost = 400000;
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Course Cost: " + course.cost);
    }
    
}
