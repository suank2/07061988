package com.inner.demo;

public class Polymorphismdemo {
	public static void main(String[] args) {
		Animal a= new Horse();
		a.eat();	
		//a.buck();  //class Animal does not have buck method So compile time error.
	}
}

class Animal{
	void eat(){
		
	}
}
class Horse extends Animal{
	void buck(){
		
	}
}