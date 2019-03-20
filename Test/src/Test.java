class SuperClass {
	public  void m1() {
		System.out.println("I am singer");
	}
}

class SubClass extends SuperClass {
	public void m1() {//METHOD OVERRIDING //SAME METHOD SIGNATURE //RETURN TPE CAN BE COVARIANT TYPE //DYNAMIC LOOK FOR OBJECT
		System.out.println("I am trion");
	}
}
public class Test {
	public static void main(String[] args) {
		SubClass t= new SubClass();
		t.m1();
		SuperClass s= new SubClass();
		s.m1();
		SuperClass s1= new SuperClass();
		s1.m1();
		//SubClass t1= new SuperClass();//COMPILE TIME ERROR //Subclass cannot see Superclass object
		
	}
}

