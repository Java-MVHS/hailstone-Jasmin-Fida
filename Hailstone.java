// Fida Jasmin
// 11-7-25
// Hailstone.java
// This will ask
// This program will ask the user to enter a number.
// We will print a sequence. If it is even, we will half it or multiply by 3
// and add 1. This will happen until it is one. 
// This is known as the Hailstone sequence by Lothar Collatz
// Working on: if statements and while/do while loops
//
// Testing: When the user enters 10, it will
// print10 and increment count  
// divide 10 by 2 and print 5, increment count
// multiply 5 by 3 and add 1 and print 16 , increment count
// divide 16 by 2 and print 8, increment count
// divide 8 by 2 and print 4, increment count
// divide 4 by 2 and print 2, increment count
// divde 2 by 2 and print 1, increment count
// Finally, print the count ( 7 times) 

import java.util.Scanner;

public class Hailstone
{
	private int num; // this will store the user input
	private int count; // this will count how many times it loops when printing
	
	/* the constructor initializes both num and count to 0. It won't return 
	 * or have any paramters since it is a default constructor. 
	 */
	public Hailstone()
	{
		count = 0;
		num = 0;
	}
	
	/* main will create an object of Hailstone and call FindIt()
	 */
	public static void main(String[] args)
	{
		Hailstone hail = new Hailstone();
		hail.findIt();
	}
	
	/*
	 * This will call the welcome prompt and as long as 
	 * num doesn't equal -1, it will call input and if 
	 * num is within the range, the sequence is called. 
	 * printCount will be called no matter if it is in the range or not.
	 * There are also 3 blank lines. 
	 * This has no return and no parameters.
	 */
	public void findIt()
	{	
		welcomePrompt();	
		do 
		{
			input();
			
			if (num>=1 && num <=10000)
			{
				sequence();
			}
			
			printCount();

		}while(num != -1);
		
		System.out.println("\n\n\n");
	}
	
	/*
	 * This is a method that has the neccesary details for the user
	 * to know and will print 3 lines.
	 * this has no return and no parameters.
	 */
	public void welcomePrompt() 
	{
		System.out.println("\n\n\n");

		System.out.println("Welcome! We will print a sequence."
			+ " If it is even, we will half it. Else, we will multiply by 3 "
			+ "and add 1. This will happen until it is one." 
			+ " This is known as the Hailstone sequence by Lothar Collatz.");
	}
	
	/*
	 * This will ask the user to input a number from 1 - 1000. 
	 * This has no parameters and no return.
	 */
	 
	public void input()
	{
		Scanner keyboard = new Scanner(System.in);
					
		System.out.print("\nEnter a positive integer ( 1 - 10000 ). "
			+ "To quit, enter -1: ");
		num = keyboard.nextInt();
		System.out.println();
	}
	
	/*
	 * This will print the sequence and increment the counter
	 * This will also check if the number is even or odd and when the count
	 * is 10, it will print a new line as long as num doesn't equal -1.
	 * This has no parameters and no return.
	 */
	public void sequence()
	{		
		while( num!=1)
		{
			System.out.printf("%8d", num);
			count++;

			if (num % 2 == 0)
			{
				num = (int) (num/2);
			}
			else 
			{
				num = (int) (num*3 + 1);
			}
			
			if (count % 10 == 0)
			{
				System.out.println();
			}
		}
		System.out.printf("%8d", num);
		count++;
	}	
			
	/* This will have error checking if it is not within the range
	 * OR if num == -1 or else it will say how many times
	 * the loop executed.
	 * This has no parameters and no return.
	 */
	public void printCount()
	{
		if (num == -1)
		{
			System.out.print("Thank you for playing Hailstone.");
			count = 0;
		}
		else if (!(num >= 1 && num <=10000))
		{
			System.out.print("Enter a value within the range, please! \n");
			count = 0;
		}
		else 
		{
			System.out.printf("\n\nThe loop executed %d times. \n", count);
			count = 0;
		}
		System.out.println();
	}
}
