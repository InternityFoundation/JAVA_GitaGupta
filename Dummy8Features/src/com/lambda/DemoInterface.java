package com.lambda;

interface Phone
{
	void whatsapp();
	void facebook();
}
class Android implements Phone
{
	public void whatsapp()
	{
		System.out.println("personal contacts");
	}
	public void facebook()
	{
		System.out.println("social contacts");
	}
}
public class DemoInterface {
		public static void main(String args[])
		{	
			Phone p=new Android();
			p.whatsapp();
			p.facebook();
		}
}
