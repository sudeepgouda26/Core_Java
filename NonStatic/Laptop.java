class Laptop{

    static String brand = "Dell";
    String colour = "Black";
    int price = 50000;
    public static void main(String[] args) {
        System.out.println("Brand: " + brand);
        Laptop laptop = new Laptop();
        laptop.colour = "Silver";
        laptop.price = 60000;
        System.out.println("Colour: " + laptop.colour);
        System.out.println("Price: " + laptop.price);
    }
}