public class Hashcode1 extends HashCodeCar {

    Hashcode1(){
        // Constructor logic here (if needed)
        super(2022, "Toyota");
        
    }
public static void main(String[] args) {
    Hashcode1 car = new Hashcode1();
     Hashcode1 car1 = new Hashcode1();

    System.out.println("HashCode: " + car.hashCode());
     System.out.println("HashCode: " + car1.hashCode());
  
    
}
}