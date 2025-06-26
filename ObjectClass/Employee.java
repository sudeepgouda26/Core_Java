public class Employee {
    int id;
    String Name;
    Employee(int id, String name) {
      this.id = id;
      this.Name = name;
    }
     public String toString(){
        return "Employee ID:  " + this.id + "Name " + this.Name;
    }

}
