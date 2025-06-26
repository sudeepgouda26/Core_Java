package EqualsMethod;


public class MainMethod {
    int id;
    String Name;

    MainMethod(int id, String name) {
        this.id = id;
        this.Name = name;
    }
    public boolean equals(Object obj){
       MainMethod employee =(MainMethod)obj;

       return this.id  ==employee.id;


    }

    public static void main(String[] args) {
        MainMethod employee1 = new MainMethod(1, "John Doe"); 
        MainMethod employee2 = new MainMethod(1, "John Doe");
        System.out.println(employee1.equals(employee2));
    }
    
}
