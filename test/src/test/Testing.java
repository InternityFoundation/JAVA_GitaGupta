package test;

public class Testing 
{
	public static void main(String args[])
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
		 System.out.println("Method doStuff");
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
		 System.out.println("Method doMoreStuff");
	}
}













