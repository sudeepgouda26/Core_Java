package EqualsMethod;
public class MainMethod1 {
 int salary;
 String name;

 MainMethod1(int salary, String name){
    this.salary = salary;
    this.name = name;

 }
 @Override
 public boolean equals(Object obj ){
    MainMethod1 emp = (MainMethod1)obj;
    if (this.salary == emp.salary && this.name.equals(emp.name)) {
        return true;
    }else{
        return false;
    }
        
    }



 public static void main(String[] args) {
      MainMethod1 empMainMethod1 =  new MainMethod1(222000, "kumar");
      MainMethod1 eMainMethod2 = new MainMethod1(222000, "shenga" );
      System.out.println(empMainMethod1.equals(eMainMethod2));

 }
}
