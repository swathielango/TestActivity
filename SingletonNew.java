package com.scuba.programs;


	 class Singleton{ 
	
	    private static Singleton instance;
	    private Singleton() { }
	    public static Singleton getInstance() {
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }
	}

	public class SingletonNew {
	    public static void main(String[] args) {
	        Singleton singleton1 = Singleton.getInstance();
	        Singleton singleton2 = Singleton.getInstance();

	        if (singleton1 == singleton2) {
	            System.out.println("Both objects are same");
	        } else {
	            System.out.println("Both objects are different");
	        }
	    }}
	