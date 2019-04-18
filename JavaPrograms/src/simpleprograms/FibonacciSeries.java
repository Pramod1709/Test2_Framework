package simpleprograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) 
	{
			// Create a new Scanner object
			Scanner sc = new Scanner(System.in);
			
			// Get the count value from user for Fibonacci series
			System.out.println("Enter the count for fibonacci series ");
			int count = sc.nextInt();
			
			int n1=0,n2=1,n3,i;   
			System.out.print(n1+" "+n2); //printing 0 and 1    
		    
		 for(i = 2; i<count; i++) //loop starts from 2 because 0 and 1 are already printed    
		 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
		 }    
		 
		 sc.close();
	
	}

}
