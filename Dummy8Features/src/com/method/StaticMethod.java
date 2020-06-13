package com.method;

interface SM
{
	static void help1()
	{
		System.out.println("Contact Santosh Maurya :santosh.maurya@internity.in");
	}
	
	static void help2()
	{
		System.out.println("Contact Ritu Yadav :ritu.yadav@internity.in");
	}
}

public class StaticMethod {
	public static void main(String... s)
	{
		SM.help1();
		SM.help2();
	}
}
