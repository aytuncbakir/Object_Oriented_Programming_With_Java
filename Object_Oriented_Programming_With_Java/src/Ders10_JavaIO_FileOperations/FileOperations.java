package Ders10_JavaIO_FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	
	public void createDirectory() {
		  
	      String directory = "C:\\Users\\sivam\\git\\Object_Oriented_Programming_With_Java"
	      		+ "\\Object_Oriented_Programming_With_Java\\resources\\";
	      
	      String filename = "test1";
	      
	      String path = directory + filename;
	      
	      //Creating a File object
	      File file = new File(path);
	      
	      
	      //Creating the directory
	      boolean bool = file.mkdir(); 
	      if(bool){
	         System.out.println("Directory created successfully");
	      }else{
	         System.out.println("Sorry couldn’t create specified directory");
	      }
		
	}
	
	public  void readFromFile() {
			
		 String path = "C:\\Users\\sivam\\git\\Object_Oriented_Programming_With_Java"
		      		+ "\\Object_Oriented_Programming_With_Java\\resources\\test.txt";
			try { 
			  FileReader  reader  = new FileReader(path); 
			 
			  BufferedReader br = new BufferedReader(reader);
			  String st; 
				  
			  while ((st = br.readLine()) != null) 
				    System.out.println(st); 
			  
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	
	public static void writeToFile() {
		 String path = "C:\\Users\\sivam\\git\\Object_Oriented_Programming_With_Java"
		      		+ "\\Object_Oriented_Programming_With_Java\\resources\\test.txt";
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(path);
			//inherited method from java.io.OutputStreamWriter 
			fileWriter.append("Merhaba write to file");
			fileWriter.append("\n");
			fileWriter.append("Merhaba write to file 1");
			fileWriter.append("\n");
			fileWriter.append("Merhaba write to file 2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileWriter != null) {
					fileWriter.flush();
					fileWriter.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
		
		
	}
