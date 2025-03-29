class Overriding// By Upcasting
{
	public void test()
	{
		System.out.println("Test1 case");
	}
}
class B extends Overriding
{
	public void test()
	{
		System.out.println("Secong test case");
	}
}
class Mainclass1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		//B b = new Overriding();
		Overriding obj = new B();
		obj.test();
		System.out.println("Main Ends");
	}
}
