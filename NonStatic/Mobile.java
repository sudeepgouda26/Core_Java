public class Mobile {
    static String brand = "Samsung";
    int cost = 20000;;
    String color = "black";

    public static void main(String[] args) {
       System.out.println("Brnd of the mobile is " + brand);
      Mobile m1 = new Mobile();
      m1.color = "white";
       m1.cost =3000;
     
       System.out.println("color of the mobile is " + m1.color);
       System.out.println("cost of ythe mobile is " + m1.cost);
    }

}
