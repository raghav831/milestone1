package assignment1;

	import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  
	public class TvShow  
	{  
	public static void main(String[] args) throws Exception  
	{  
		String file = "/Users/raghbhatia/Downloads/netflix_titles.csv";
	       String delimiter = ",";
	       String line;
	       Scanner sc= new Scanner(System.in);
	       System.out.print("Enter number of records");  
	       int n= sc.nextInt();
	       //n=n+1;
	       String typeFilter="TV Show";
	       List<List<String>> lines = new ArrayList();
	        try (BufferedReader br =
	                     new BufferedReader(new FileReader(file))) {
	            while((line = br.readLine()) != null){
	                List<String> values = Arrays.asList(line.split(delimiter));
	                
	                if(typeFilter.equals(values.get(1)) && (n>0) ) {
	                	System.out.println(values);	
	                	n=n-1;
	                	
	                }          
	            }
	      
	        } catch (Exception e){
	        	System.out.println("");
	        }
	}  
	}  
