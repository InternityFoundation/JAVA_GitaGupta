package com.basepackage.utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateCSV {
	
		public static void main(String[] args)
		{
			BufferedReader br=null;
			String line="";
			String splitBy=",";
			try
			{
				List<Women> womens=new ArrayList<Women>();
				br= new BufferedReader(new FileReader("D:\\InternityJava\\women (1).csv"));
				while((line=br.readLine())!=null)
				{
					String[] fields=line.split(splitBy);
					System.out.println(fields.length);
					
					if(fields.length > 0) {
						Women women=new Women();
						women.setHeight(Integer.parseInt(fields[0]));
						women.setWeight(Integer.parseInt(fields[1]));
						womens.add(women);
					}
				}
				for(Women w:womens)
				{
					System.out.printf("[height=%d,weight=%d]\n",w.getHeight(),w.getWeight());
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(br!=null)
				{
					try
					{
						br.close();
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
			}
		}


	}

//Stream.of(data).forEach(System.out::println);


//	Stream<String> stream=Arrays.stream(data);
	//System.out.println(stream);
	//myStream.forEach(s -> System.out.println(s));
	//Arrays.stream(data).forEach(part -> System.out.println(part));
	//Arrays.stream(data).forEach(System.out::println);
	//System.out.println(data[0]+ ":"+data[1]);