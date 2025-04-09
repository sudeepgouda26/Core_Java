class Main2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Html_5 h = new Html_5();
		h.editor();
	}
}
class HTml_4
{
	void editor(){
   System.out.println("Editor without emoji");
	}
}

class Html_5 extends HTml_4
{
	void editor(){
		super.editor();
		System.out.println("Editor with emoji");
	}
}