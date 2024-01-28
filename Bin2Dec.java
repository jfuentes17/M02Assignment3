/*
 * Program Name: BinaryFormatExceptionTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: This program defines a custom exception called 
 * 		BinaryFormatException, and implements the bin2Dec method to
 * 		throw a BinaryFormatException if the string is not a binary string.
 */

import java.util.*;

public class Bin2Dec 
{
	public static int bin2Dec(String binaryString) throws BinaryFormatException
	{
		for(char c: binaryString.toCharArray()) 
		{
			if(c != '0' && c != '1') 
			{
				throw new BinaryFormatException(binaryString);
			}
		}
		
		int decimal = 0;
		int num = 0;
		for (int i = binaryString.length()-1; i >= 0; i--) 
		{
			char c = binaryString.charAt(i);
			if (c == '1') 
			{
				decimal += Math.pow(2, num);
			}
			num++;
		}
		return decimal;
	}
}
//This should check to see if the input string contains anything other than 0 and 1.
//If it does, the program throws it.