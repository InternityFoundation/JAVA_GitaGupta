package com.datetimeAPI;

//import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DT_API 
{
	public static void main(String... s)
	{
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("DATE-TIME NOW"+dt);
		
		System.out.println("_________");
		
		LocalDate d=LocalDate.now();
		System.out.println("DATE NOW"+d);
		
		System.out.println("_________");
		
		LocalTime t=LocalTime.now();
		System.out.println("TIME NOW"+t);
		
		System.out.println("_________");
		
		LocalDate d1=LocalDate.of(1980, Month.MAY ,5);
		System.out.println("DATE GIVEN:"+d1);
		
		System.out.println("_________");
		
		LocalTime t1=LocalTime.of(12,35,10,999);
		System.out.println("TIME GIVEN"+t1);
		
		System.out.println("_________");
		
		LocalTime t2=LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println("TIME IN ASIA(KUWAIT):"+t2);
		
		System.out.println("_________");
		
		LocalDateTime date = LocalDateTime.now(); 
	    DateTimeFormatter format1 =   DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	      
	    String formattedCurrentDate = date.format(format1); 
	      
	    System.out.println("formatted current Date and"+" Time : "+formattedCurrentDate);  
	    
	    System.out.println("_________");
	}
}
