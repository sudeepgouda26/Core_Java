public class Car {
  int cost = 1000000;
  String color = "Black";
  String Type="petrol";
  
  public static void main(String[] args) {
    Car c = new Car();
    c.cost=2000000;
    c.color ="red";
    c.Type="diesel";

    System.out.println("Cost of the car is " + c.cost);
    System.out.println("Color of the car is " + c.color);
    System.out.println("Type of the car is " + c.Type);
    
  }
}
