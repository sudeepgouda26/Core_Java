class Mainclass4
{
	public static void main(String[] args) 
	{
    Test5 T1 = new Test5();

		System.out.println(T1.x);
		System.out.println(T1.z);
		System.out.println(T1.p);
		Demo4 d2 = new Demo4();
		System.out.println(d2.x);
		System.out.println(d2.y);

		Cool5 c1 = new Cool5();
		System.out.println(c1.l);
			System.out.println(c1.x);

		
	}
}

class Sample4
{
	int x =10;
}
class Demo4 extends Sample4
{
	int y =0;
}
class Test4 extends Sample4
{
	int z =10;
}
class Test5 extends Tset4 
{
	int p = 546;
}
	class Cool5 extends Sample4
	{
		int l =56;
	}
