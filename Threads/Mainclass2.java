 import java.lang.Thread;
 class main {
    public static void m1(){
        for(int i =0; i <10; i++){
            System.out.println(i);
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
              System.out.println("handeled");
        }
    }


    }
 
 public static void m2(){
    for(int i =0; i <10; i++){
        System.out.println(i);
    
    try {
        Thread.sleep(1000);
    } catch (Exception e) {
          System.out.println("handeled");
    }
    

}
}}

class Sample1 extends Thread{
    public void run (){
        main.m1();
    }
}
class Sample2 extends Thread{
    public void run(){
        main.m2();
    }
}

class Mainclass2{
    public static void main(String[] args){
     Sample1 s = new Sample1()
     ;
     Thread t = new Thread(s);
     t.start();

     Sample2 s1  = new Sample2();
     Thread t2 = new Thread(s1);
     t2.start();
    }
}