public class Mobile {
    int price ;
    String brand ;
    String clr ;

    Mobile(int price, String brand, String clr){
        this.price = price;
        this.brand = brand;
        this.clr= clr;

    }
    public static void main(String[] args){
        Mobile m = new Mobile( 1000, "Samsung", "Black");
        System.out.println(m.price);
        System.out.println(m.brand);
        System.out.println(m.clr);
    }
}
