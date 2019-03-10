package com.inner.demo;

public class OuterClass1 {
	//Instance variable for Outer class
		private int x = 7;
		
		public void makeInner(){
			InnerClass1 in = new InnerClass1();
			in.seeOuter();
		}
		
		//Inner class access modifier can be final abstract public protected private static strictfp 
		public class InnerClass1{
			public void seeOuter(){
				System.out.println("Outer x is "+x);
				
				//Referencing inner instance from within the Inner class
				System.out.println("Inner instance is "+this);
				
				//Referencing outer instance from within the Inner class
				System.out.println("Outer instance is "+OuterClass1.this);
			}
		}
		public static void main(String[] args) {
			OuterClass1.InnerClass1 inner = new OuterClass1().new InnerClass1();
			inner.seeOuter();
		}
}
