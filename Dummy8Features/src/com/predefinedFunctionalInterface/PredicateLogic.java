package com.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateLogic {
		public static void main(String... p)
		{
			Predicate<String> checklength=str->str.length()>5;
			System.out.println(checklength.test("predicate"));
		}
}
