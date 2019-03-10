package com.inner.demo;

public class MyOuter2 {
	private int x = 7;
	void doStuff(){

	 final String z = "string is final";
	 	
	 	//Inner class is 
	 	class MyInner{
			public void seeOuter(){
				System.out.println("Outer x is-->"+x);
				System.out.println("Local variable is -->"+z);
			}
		}
		MyInner in = new MyInner();
		in.seeOuter();
	}
	public static void main(String[] args) {
		MyOuter2 outer = new MyOuter2();
		outer.doStuff();
	}
}
