 interface Sample1
 {
	 int x =10;

	 void cool();
	 void  test();
 }

  
 abstract class Demo implements Sample1
 {
	 public void cool(){
		 System.out.println("Hello disp");

	 }
 }

 class Test extends Demo
 {
	 public void test(){
		 System.out.println("its cool");


	 }
 }

class Mainclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t = new Test();
		System.out.println(t.x);
		t.test();
		t.cool();
	}
}
