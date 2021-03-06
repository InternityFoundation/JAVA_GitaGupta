package com.streamAPI;

import java.util.*;
import java.util.stream.*;
public class Stream8 {
	public static void main(String... s)
	{
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		
		System.out.println("Added elements");
		System.out.println(marks);
		
		List<Integer> sortedMarks=marks.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedMarks:");
		System.out.println(sortedMarks);
		
		//customised sorting
		List<Integer> sortedMarks2= marks.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println("sortedMarks2:");
		System.out.println(sortedMarks2);
		
		Integer min=marks.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println("min="+min);
		
		
		Integer max=marks.stream().max ((l,m)->l.compareTo(m)).get();
		System.out.println("max="+max);
		
	
	
	}
	
	
}
