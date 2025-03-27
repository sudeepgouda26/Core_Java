class Mainclass2
{
	public static void main(String[] args) 
	{
    Test2 T1 = new Test2();

		System.out.println(T1.x);
		System.out.println(T1.y);
		System.out.println(T1.z);
	}
}

class Sample2
{
	int x =10;
}
class Demo2 extends Sample2
{
	int y =0;
}
class Test2 extends Demo2
{
	int z =10;
}