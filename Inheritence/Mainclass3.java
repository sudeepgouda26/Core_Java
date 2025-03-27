class Mainclass3
{
	public static void main(String[] args) 
	{
    Test3 T1 = new Test3();

		System.out.println(T1.x);
		System.out.println(T1.z);
		Demo3 d2 = new Demo3();
		System.out.println(d2.x);
		System.out.println(d2.y);

		
	}
}

class Sample3
{
	int x =10;
}
class Demo3 extends Sample3
{
	int y =0;
}
class Test3 extends Sample3
{
	int z =10;
}
