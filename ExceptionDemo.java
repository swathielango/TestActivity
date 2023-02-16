package com.scuba.programs;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		int a = 4;
		int b = 0;
		int c = 0;
		
		try
		{	
			c = a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println("Need to change a value");
		}
		
		finally
		{
			System.out.println("Log off");
		}
	}

}