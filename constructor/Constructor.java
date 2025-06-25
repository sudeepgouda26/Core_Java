public class Constructor {
    String Name;
    int age;
   
   

   Constructor(){
        this.Name = "John";
        this.age = 30;
    }
  
    Constructor(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }
    Constructor(String Name) {
        this.Name = Name;
    }

    public static void main(String[] args) {
        

         Constructor person = new Constructor();
        Constructor person2 = new Constructor( "Jane", 25);
        Constructor person3 = new Constructor("Alice");
       System.out.println(person2.Name);
       System.out.println(person3.Name);
         System.out.println(person.Name);
    
    }
   
    
}
