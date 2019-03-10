package com.inner.demo;

public class OuterClass {
	
	//Instance variable for Outer class
	private int x = 7;
	
	//Inner class access modifier can be final abstract public protected private static strictfp 
	public class InnerClass{
		public void seeOuter(){
			System.out.println("Outer x is "+x);
		}
	}
	public static void main(String[] args) {
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.seeOuter();
	}
}
