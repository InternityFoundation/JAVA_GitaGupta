package com.predefinedFunctionalInterface;

import java.util.Scanner;
import java.util.function.*;

public class BiPredicateLogic {
		public static void main(String... p)
		{
//			BiPredicate<Integer,Integer> bp =(a,b)->(a+b)%2==0;
//			System.out.println(bp.test(10,20));
			
			Scanner sc=new Scanner(System.in);
			System.out.println("PLEASE ENTER THE DETAILS FOR DELETING RECORD:");
			System.out.println("ADMIN USERNAME:");
			String userName=sc.nextLine();
			System.out.println("ADMIN USERNAME:"+userName);
			
			System.out.println("ADMIN PASSWORD:");
			int adminId=sc.nextInt();
			System.out.println("ADMIN PASSWORD:"+adminId);
			
			
			BiPredicate<String,Integer> biPredicate = (n, s) -> 
	        { 
	        	System.out.println(n);
	        	System.out.println(s);
	            if (n.equals("ADMIN") && s==201030)
	            {
	            	System.out.println("Q NI GYA?");
	            	return true;
	            }
//	            if ( s==201030)
//            {
//            	System.out.println("Q NI GYA?");
//            	return true;
//            }
	            return false; 
	        }; 
	  
	        System.out.println(biPredicate.test(userName,adminId)); 
	  
	        // Predicate for checking greater than 
//	        BiPredicate<Integer, String> biPredicate1 = (n, s) -> 
//	        { 
//	            if (n > Integer.parseInt(s)) 
//	                return true; 
//	            return false; 
//	        }; 
//	  
//	        // ANDing the two predicates 
//	        BiPredicate<Integer, String> biPredicate2 
//	            = biPredicate.and(biPredicate1); 
//	        System.out.println(biPredicate2.test(2, "3")); 
//			
	        sc.close();
		}
}
