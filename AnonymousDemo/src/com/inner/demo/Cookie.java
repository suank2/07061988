package com.inner.demo;

/* KEY POINTS
 * Anonymous interface implementers
 * can implement only 1 interface
 * anonymous class cannot extend a class and implement interface at same time.
 */
public class Cookie { 
	
	//creates an anonymous implementer of the specified interface type.
	
	Cookable c = new Cookable(){//it is not instantiating Cookable object, it is creating new anonymous, implementer of Cookable 
		public void cook(){
			System.out.println("cookie cookable");
		}
	};
	public static void main(String[] args) {
		Cookie e = new Cookie();
		e.c.cook();
	}
}
