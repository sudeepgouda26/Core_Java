public class Constructor {
    String Name;
    int age;
   
   

//    Constructor(){
//         this.Name = "John";
//         this.age = 30;
//     }
    Constructor(){
        this("cena" ); // Calling another constructor with default values
    }
  
    Constructor(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }
    Constructor(String Name) {
        this.Name = Name;
    }
    Constructor(Constructor person){
        this.Name =person.Name;
        this.age = person.age;
    }

    public static void main(String[] args) {
        

         Constructor person = new Constructor();
        Constructor person2 = new Constructor( "Jane", 25);
        Constructor person3 = new Constructor("Alice");
        Constructor person4 = new Constructor();
        
         System.out.println(person4.Name);
         
         
         // Using the copy constructor

        Constructor random = new Constructor(person);
         System.out.println(random.Name);
         System.out.println(random.age);

       System.out.println(person2.Name);
       System.out.println(person3.Name);
         System.out.println(person.Name);
    
    }
   
    
}
