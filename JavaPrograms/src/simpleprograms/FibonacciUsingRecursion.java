package simpleprograms;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count)
	 {    
	    if(count>0)
	    {    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }  
	 }

	public static void main(String[] args) 
	{
		// Create a new Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get the count value from user for Fibonacci series
		System.out.println("Enter the count for fibonacci series ");
		int count = sc.nextInt();
		System.out.print(n1+" "+n2);//printing 0 and 1    
		printFibonacci(count-2);//n-2 because 2 numbers are already printed 
		sc.close();

	}

}
