 import java.lang.Thread;
  class Sample {
   synchronized public static void m1() throws InterruptedException{
        for(int i =0; i<10; i++){
 System.out.println(i);
 Thread.sleep(1000);
        }
    }
synchronized    public static void m2() throws InterruptedException{
        for(int i =0; i<10; i++){
 System.out.println(i);
 Thread.sleep(1000);
        }
    }
  }

  class Sample1 implements Runnable{
   
    public void run(){
        try {
            Sample.m1();
        } catch (InterruptedException e) {
            System.out.println("handeled");
        }

    }
  }
  class Sample2 implements Runnable{
 
    public void run(){
        try {
            Sample.m2();
        } catch (InterruptedException e) {
            System.out.println("handeled");
        }

    }
  }
 class Mainclass3{
    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        Thread t = new Thread(s1);
         t.start();
         Sample1 s2 = new Sample1();
         Thread t2 = new Thread(s2);
          t2.start();
    }
}