package simpleprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int i,m=0,flag=0; 
		// Enter the number to check whether is is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:" );
		int number = sc.nextInt();
		
		m=number/2;      
		  if(number==0||number==1)
		  {  
			   System.out.println(number+" is not prime number");      
		  }else
		  {  
			  for(i=2;i<=m;i++)
			   {      
			    if(number%i==0)
				    {      
				     System.out.println(number+" is not prime number");      
				     flag=1;      
				     break;      
				    }      
			   }      
			   if(flag==0)  
			   { 
				   System.out.println(number+" is prime number"); 
			   }  
		  } //end of else 
		  sc.close();
	}

}
