public class JobSearches {

   
     static void search() {
        System.out.println("Searching for jobs...");
    }

   
   static void search(String jobTitle) {
        System.out.println("Searching for jobs with title: " + jobTitle);
    }

 
    static void search(String jobTitle, String location) {
        System.out.println("Searching for jobs with title: " + jobTitle + " in location: " + location);
    }

    public static void main(String[] args) {
      
        search();
        search("Software Engineer");
        search("Software Engineer", "New York");
    }
}
