package inheritance;
class A{
//	void m1{}
}
class B extends A{
	//void m1{
		
	//}
}
public class Parent {
	 A m1() {
		System.out.println("overriden method");
		return new A();
	}
	
	/*void m1(int x) {
		System.out.println("overloaded method of parent");
	}*/
	 }
class Child extends Parent{
	B m1() {
		System.out.println("overriding method");
		return new B();
	}
	/*void m1(int y) {
		System.out.println("overloded method of child");
	}*/
}
class Demo1{
	public static void main(String[] args) {
		Parent ob=new Parent();
		A a=ob.m1();
	//	ob.m1();
		
		//Child c=new Child();
	//	c.m1();
		
	//	ob=c;
		
		//ob.m1();
		
		Parent c=new Child();
		A j =c.m1();
		//c.m1();
		//c.m1(12);
		//c.m1(23.5f);
		//A a=obj.m1();
	}
}
