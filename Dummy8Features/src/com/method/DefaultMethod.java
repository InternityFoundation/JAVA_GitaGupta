package com.method;

interface DM
{
	public void abstractmethod();//single
	default void coach1()
	{
		System.out.println("ABHINAV SIR");
	}
	
	default void coach2()
	{
		System.out.println("SAIKAT SIR");
	}

}
class A implements DM
{
	public void abstractmethod()
	{
		System.out.println("only one stream lead  allowed in a stream");
	}
	@Override
	public  void coach2()
	{
		System.out.println("MEENAKSHI MAM SOLVES PROBLEM");
	}
}

public class DefaultMethod
{
	public static void main(String... d)
	{
		
		DM obj=new A();//cannot create object of interface but can create reference of interfece
		obj.abstractmethod();
		
		obj.coach1();
		
		obj.coach2();
	}

}
