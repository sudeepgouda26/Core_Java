public class Factory {
    String name;
    String location;

    Factory (String name, String location) {
        this.name = name;
        this.location = location;
        
    }
    public String toString(){
        return "Factory Name: " + this.name + ", Location: " + this.location;
    }
}
