class Overriding // using super keyword
{
	public void test()
	{
		System.out.println("First test case");
	}
}
class B extends Overlode
{
	public void test()
	{
		super.test();
		System.out.println("Second test case");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		B b = new B();
		b.test();
		System.out.println("Main Ends");
	}
}
