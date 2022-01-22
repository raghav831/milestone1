package assignment1;

	import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  
	public class HorrorMovies  
	{  
	public static void main(String[] args) throws Exception  
	{  
		String file = "/Users/raghbhatia/Downloads/netflix_titles.csv";
	       String delimiter = ",";
	       String line;
	       Scanner sc= new Scanner(System.in);
	       System.out.print("Enter number of records");  
	       int n= sc.nextInt();
	       String listedFilter="Horror Movies";
	       List<List<String>> lines = new ArrayList();
	        try (BufferedReader br =
	                     new BufferedReader(new FileReader(file))) {
	            while((line = br.readLine()) != null){
	                List<String> values = Arrays.asList(line.split(delimiter));
	                System.out.println(values);
//	                if(listedFilter.contains(values.get(12)) && (n>0) ) {
//	                	n=n-1;
//	                	System.out.println(values);	
//	                }          
	            }
	      
	        } catch (Exception e){
	            System.out.println("");
	        }
	}  
	}  
