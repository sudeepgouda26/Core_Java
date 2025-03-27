public class Car {

    int price;
    String brand;
    String clr;

    Car(int price, String brand, String clr) {
        this.price = price;
        this.brand = brand;
        this.clr = clr;

    }

    public static void main(String[] args) {
        Car c = new Car(1000, "Toyota", "White");
        System.out.println(c.price);
        System.out.println(c.brand);
        System.out.println(c.clr);
    }
}