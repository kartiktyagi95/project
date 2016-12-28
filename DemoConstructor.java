class Constructor
{
	int res;
	
	Constructor(int x, int y)
	{
		res = x + y;			
	}	

	void show()
	{
		System.out.println("Addition=" +res);
	}
}

public class DemoConstructor 
{
	public static void main(String arg[])
	{
		Constructor obj1 = new Constructor(2,2);
		obj1.show();
		Constructor obj2 = new Constructor(3,3);
		obj2.show();
	}
}
