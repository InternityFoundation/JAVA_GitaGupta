package com.predefinedFunctionalInterface;
import java.util.function.Consumer;

public class ConsumerLogic {	
	public static void main(String... pn)
	{
		
	Consumer<String> word=s->System.out.println(s);
	word.accept("HELLO!! I CONSUMES EVERYTHING...");
	
			
	}
}
