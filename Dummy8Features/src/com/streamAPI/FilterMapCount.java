package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapCount {
	public static void main(String[] args) {
		List<String> city=new ArrayList<String>();
		city.add("Mumbai");
		city.add("Delhi");
		city.add("Kolkata");
		city.add("Chennai");
		System.out.println(city);
		
		
		//string length using map
		List<Integer> cityLength=city.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(cityLength);
		
		//string length using filter
		List<String> cityLengthgreater=city.stream().filter(x->x.length()>6).collect(Collectors.toList());
		System.out.println(cityLengthgreater);
		
		//count greater than 6
		long citycount=city.stream().filter(x->x.length()>6).count();
		System.out.println(citycount);
		
		// using filter startswith
		List<String> citystartswith=city.stream().filter(f->f.startsWith("D")).collect(Collectors.toList());
		System.out.println(citystartswith);
		
		
				
		
	}
}
