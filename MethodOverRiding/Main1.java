class Main1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Atm_1 A = new Atm_1();
		A.money();
	}
}

class Atm
{
	void money(){
        System.out.println("With Draw MOney with card");
	}
}

class Atm_1 extends Atm 
{
	void money(){
			super.money();
		System.out.println("Withdraw money without Card");
	
	}
}
