class Mainclass1
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();

		System.out.println(d1.x);
		System.out.println(d1.y);
	}
}

class Sample1
{
	int x =10;
}
class Demo1 extends Sample1
{
	int y =0;
}