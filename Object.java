class Object
{
	int x;
	int y;
	int res;

	void add(int x , int y)
	{
		res = x + y;	
	}

	void show()
	{
		System.out.println("res=" +res);
	}

}

class DemoObject
{
	public static void main(String arg[])
	{
		Object obj1 = new Object();
		obj1.add(1,1);
		obj1.show();
	}
}