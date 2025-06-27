public class HashCodeCar {

    int year;
    String model;

    HashCodeCar(int year, String model){
        this.year = year;
        this.model = model;
    }

    public int hashCode(){
        int hashCode =17;
        hashCode =hashCode+year;
        hashCode =hashCode +model.hashCode();
        return hashCode;
    }
}
