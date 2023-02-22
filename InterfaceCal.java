package com.scuba.programs;

interface CalculatorNew
{
	double s = 3.14;
	abstract void add(int a, int b);
	abstract void sub(int a, int b);	
}
	
class MyCalculator1 implements CalculatorNew
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
}

public class InterfaceCal 
{
	public static void main(String[] args) 
	{
		System.out.println(CalculatorNew.s);
		CalculatorNew c1  = new MyCalculator1();
		c1.add(7, 3);	
	}
}

