package com.scuba.programs;

public class ConstructorCar 
{
	static String Company = "TATA";
	String Colour;
	double price;
	int modelno;
	
	ConstructorCar(int arg1, double arg2, String arg3)
	{
		modelno= arg1;
		price = arg2;
		Colour = arg3;		
	}	

	public static void main(String[] args) {
		
		System.out.println("Car Campany: "+ConstructorCar.Company);
		
		ConstructorCar car = new ConstructorCar(2022,50000,"Blue");
		System.out.println("ModelNo. "+car.modelno);
		System.out.println("Price: "+car.price);
		System.out.println("Colour: "+car.Colour);		
	}
}

