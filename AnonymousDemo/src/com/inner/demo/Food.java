package com.inner.demo;

public class Food {
	
	//Food has one instance variable declared as type Popcorn
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
