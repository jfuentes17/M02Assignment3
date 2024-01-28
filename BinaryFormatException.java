/*
 * Program Name: BinaryFormatExceptionTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: This program defines a custom exception called 
 * 		BinaryFormatException, and implements the bin2Dec method to
 * 		throw a BinaryFormatException if the string is not a binary string.
 */
import java.util.*;

public class BinaryFormatException extends NumberFormatException
{
	private String binaryString;
	public BinaryFormatException(String binaryString) 
	{
		super(binaryString + " is not a binary string.");
		this.binaryString = binaryString;
	}
	//This is the output if the input is not a correct string.
	
	public String getBinaryString() 
	{
		return binaryString;
	}
	//This should return the correct string.
}
