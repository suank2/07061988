package com.inner.demo;

public class Food {
	
	//Food has one instance variable declared as type Popcorn
	//Food has no methods
	//Popcorn reference variable does not refer to an instance of Popcorn,
	//but to an instance of an anonymous subclass of Popcorn
	
	Popcorn p = new Popcorn(){		
		public void pop(){
			System.out.println("anonymous");
		}
	};
	public static void main(String[] args) {
		
		Food f = new Food();
		f.p.pop();
	}
}
