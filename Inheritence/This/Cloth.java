

public class Cloth {
    int price;  
    String brand;
    String clr;

    Cloth(int price, String brand, String clr){
        this.price = price;
        this.brand = brand;
        this.clr = clr;
    }
    public static void main(String[] args) {
        Cloth c = new Cloth(1000, "Levis", "Blue");
        System.out.println(c.price);
        System.out.println(c.brand);
        System.out.println(c.clr);
    }
}
