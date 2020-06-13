package com.predefinedFunctionalInterface;

import java.util.function.*;
//import java.util.function.BinaryOperator;

public class BifunctionLogic {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,String> logic=(a,b)->(a+b)+" IS THE ANSWER USING BIFUNCTION LOGIC";
		System.out.println(logic.apply(2,4));
		
		BinaryOperator<String> bo=(s1,s2)->s1+s2;
		System.out.println(bo.apply("BINARY","OPERATOR"));
			

	}

}
