

public class School {
    int price;
    String Name;
    String section;

    School(int price, String Name, String section) {
        this.price = price;
        this.Name = Name;
        this.section = section;

    }

    public static void main(String[] args) {
        School s = new School(1000, "St. Joseph", "White");
        System.out.println(s.price);
        System.out.println(s.Name);
        System.out.println(s.section);
    }
    
}
