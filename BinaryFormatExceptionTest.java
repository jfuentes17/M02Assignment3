/*
 * Program Name: BinaryFormatExceptionTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: This program defines a custom exception called 
 * 		BinaryFormatException, and implements the bin2Dec method to
 * 		throw a BinaryFormatException if the string is not a binary string.
 */

import java.util.*;

public class BinaryFormatExceptionTest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//This creates the scanner.
		
		System.out.print("Please enter a binary number: ");
		try 
		{
			System.out.println(Bin2Dec.bin2Dec(scan.nextLine()));
		}
		catch(NumberFormatException exception)
		{
			System.out.println(exception.getMessage());
		}
		scan.close();
	}
	//This took me forever to figure out. I honestly did not know exactly what
	//the problem in the book was asking for the longest time. Then, on how to 
	//implement it, very lastly did I remember that try/catch was a thing.
}
