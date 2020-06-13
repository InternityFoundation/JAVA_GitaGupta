package com.predefinedFunctionalInterface;

import java.util.function.*;

public class BiConsumerLogic {
	public static void main(String... p)
	{
		BiConsumer<Integer,Integer> bp =(a,b)-> System.out.println(a+b);
		bp.accept(10,20);
		
	}

}
