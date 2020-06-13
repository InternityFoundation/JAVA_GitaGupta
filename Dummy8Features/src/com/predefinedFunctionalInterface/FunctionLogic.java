package com.predefinedFunctionalInterface;

import java.util.function.*;

public class FunctionLogic {
	public static void main(String... pn)
	{
		Function<Integer,String> nameInfo=s->s*10+" is the result after multiplication";
	System.out.println(nameInfo.apply(2));
	
	UnaryOperator<Integer> uo=i->i+i;
	System.out.println(uo.apply(2));
			
	}

}
