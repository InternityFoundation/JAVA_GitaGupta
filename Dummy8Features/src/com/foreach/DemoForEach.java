package com.foreach;
import java.util.Arrays;
import java.util.List;

public class DemoForEach 
	{
		public static void main(String... args)
		{
			List<Integer> values= Arrays.asList(4,5,6,7,8);
			
//		for(int i=0;i<values.size();i++)
//			{
//				System.out.println(values.get(i));
//			}
////////			//enhanced for-loop or for-in loop	(external loop)
			//i will fetch values from value
//			for(int i : values)
//			{
//				System.out.println(i);
//			}
//			//for-each loop (Internal loops) fetching all the values from value and print
			values.forEach(i -> System.out.println(i));
			
		}
	}
