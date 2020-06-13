package com.lambda;

@FunctionalInterface
interface FI
{
	void streamLead(String s);
	//void streamLead2(String s);
}

public class DemoFunctionInterface {
	public static void main(String... args)
	{
		FI fd= (s) -> System.out.println(s+" is our stream lead");
		fd.streamLead("Ayush Sir");
		
		//fd.streamLead2("Anyother stream lead");
	}

}
