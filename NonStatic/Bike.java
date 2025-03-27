public class Bike {
    static String Brand = "Honda";
    String colour = "Red";
    int price = 100;

    public static void main(String[] args) {
        System.out.println("Brand: " + Brand);
        Bike bike = new Bike();
        bike.colour = "Blue";
        bike.price = 200;
        System.out.println("Colour: " + bike.colour);
        System.out.println("Speed: " + bike.price);
    }
}
