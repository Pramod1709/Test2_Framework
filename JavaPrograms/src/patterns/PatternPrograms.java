package patterns;

import java.util.Scanner;

public class PatternPrograms {

	public static void main(String[] args) 
	{
		// Create a new Scanner object
        Scanner sc = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = sc.nextInt();
        
        System.out.println("****** Pattern 1 : Printing half pyramid with repeated numbers ******");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
       System.out.println();
       System.out.println("****** Pattern 2 : Printing half pyramid with incremented numbers ******");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println("****** Pattern 3 : Printing inverted half pyramid with repeated numbers ******");
        for (int i = rows; i>=1; i--)
        {
        	for (int j = 1; j<=i; j++)
        	{
        		System.out.print(j+ " ");
        	}
        	System.out.println();
        }
        
        
        System.out.println();
        System.out.println("****** Pattern 4 : Printing triangle with incremented numbers ******");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " "); // For triangle with repeated numbers replace 'k' with 'i'
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("****** Pattern 5 : Printing Floyd's triangle ******");
        int number = 1;
        for (int i = 1; i <= rows; i++)
        {
        	for (int j = 1; j <= i; j++)
        	{
        		System.out.print(number +" ");
        		number++;
        	}
        	System.out.println();
        }
        
        sc.close();
		
		
/*int i, j, k;
        
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= i; k++)
                System.out.print(k + " ");
 
            System.out.println();
        }
 
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" ");
 
            for (k = 1; k <= 5 - i; k++)
                System.out.print(k + " ");
 
            System.out.println();*/
        }
 
    }


