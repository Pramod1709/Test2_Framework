package simpleprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		// Objects of String class
		 String original, reverse = ""; 
		 
		// Create a scanner object 
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome?");  
	      original = sc.nextLine();   
	      
	      int length = original.length();   
	      for(int i=length-1; i>=0; i--)  
	         {
	    	  reverse = reverse + original.charAt(i);
	    	  }  
	      if(original.equals(reverse))  
	         {
	    	  System.out.println("Entered string/number is a palindrome."); 
	    	  } 
	      else  
	         {
	    	  System.out.println("Entered string/number isn't a palindrome.");
	    	  }
	      sc.close();
	   }  
}