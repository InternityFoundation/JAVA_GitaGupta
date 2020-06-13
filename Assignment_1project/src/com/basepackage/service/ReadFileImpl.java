
package com.basepackage.service;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.basepackage.bean.Csv;
import com.basepackage.dao.InsertDatabase;
import com.basepackage.dao.InsertDatabaseImpl;

public class ReadFileImpl implements ReadFile{
	@Override
 	public void readFile() {
	
		 //read Csv while loop
		 List<Csv>  csvList = new ArrayList<>();
		 //split
		 csvList.add((new Csv("username","password",123,"job_status","company")));
	}
	 
	 public void readCsv() throws IOException {
			//read csv 
			List<Csv> csvList=new ArrayList<>();
			//split
			try {
				java.util.List<String> lines = Files.readAllLines(Paths.get("/Aasignment__1/file/employee_data.txt"));
				for(String line :lines) {
					String[] result = line.split(",");
					for(String s: result) {
						System.out.println(s);
					}
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			csvList.add(new Csv("username","password",123,"job_status","company"));
			InsertDatabase insertData = new InsertDatabaseImpl();
			insertData.insertValue(csvList);
		}
 }