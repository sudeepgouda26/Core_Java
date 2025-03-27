public class JobSearch {

  
    public void search(String title) {
        System.out.println("Searching jobs with title: " + title);
    }

    
    public void search(String title, String location) {
        System.out.println("Searching jobs with title: " + title + " in location: " + location);
    }

  
    public void search(String title, String location, double minSalary) {
        System.out.println("Searching jobs with title: " + title + ", location: " + location + ", and minimum salary: " + minSalary);
    }

    public static void main(String[] args) {
        JobSearch jobSearch = new JobSearch();
        jobSearch.search("Developer");
        jobSearch.search("Developer", "New York");
        jobSearch.search("Developer", "New York", 60000);
    }
}
