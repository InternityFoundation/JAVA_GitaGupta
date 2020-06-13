package com.predefinedFunctionalInterface;

import java.util.function.Supplier;

public class SupplierLogic {
	public static void main(String... pn)
	{
		Supplier<Double> IntRandom=()->Math.random();
	System.out.println(IntRandom.get());
			
	}

}
