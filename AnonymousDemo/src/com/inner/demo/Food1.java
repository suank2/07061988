package com.inner.demo;

//
public class Food1 {
	Popcorn p = new Popcorn(){
		public void pop(){
			System.out.println("anonymous");
		}
		public void sizzle(){
			System.out.println("sizzle method");
		}
	};
	
	public static void main(String[] args) {
		Food1 f = new Food1();
		f.p.pop();
		//f.p.sizzle(); //  CTE cannot resolve symbol method sizzle 
	}
}
