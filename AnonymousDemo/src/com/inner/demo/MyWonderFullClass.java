package com.inner.demo;

public class MyWonderFullClass {
	public static void main(String[] args) {
		MyWonderFullClass w = new MyWonderFullClass();
		w.go();
	}
	void go(){
		Bar b = new Bar();
		b.doStuff(new Foo(){
				public void foof(){
					System.out.println("argument defined anonymous");
				}
			}
		);
	}
}
class Bar{
	void doStuff(Foo f){}
}
interface Foo{
	void foof();
}