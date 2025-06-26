public class Car {
    int price;
    String model;


    Car(int price, String model){
        this.price = price;
        this.model = model;
    }

    public String toString(){
        return "Car Model: " + model + ", Price: " + price;
    }
    
}
