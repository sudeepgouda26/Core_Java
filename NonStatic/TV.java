public class TV {
    static String Brand= "samsung";
    int cost = 50000;
    String type = "LED";
    public static void main(String[] args) {
        System.out.println("Brand: "+Brand);
        TV t1 = new TV();
        t1.cost= 60000;
        t1.type = "OLED";
        System.out.println("Cost: "+t1.cost);
        System.out.println("Type: "+t1.type);
    }

}
