class College {

 
   void displayInfo(String name) {
        System.out.println("College Name: " + name);
    }

    void displayInfo(String name, String location) {
        System.out.println("College Name: " + name + ", Location: " + location);
    }

    
    void displayInfo(String name, String location, int rank) {
        System.out.println("College Name: " + name + ", Location: " + location + ", Rank: " + rank);
    }

    public static void main(String[] args) {
        College college = new College();

        college.displayInfo("ABC College");
        college.displayInfo("ABC College", "New York");
        college.displayInfo("ABC College", "New York", 1);
    }
}
