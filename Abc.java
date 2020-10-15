package inheritance;


interface inner{
	int num=8;
	void abc();
	static void show() {
		System.out.println("welcome");
	}
}
class Hock implements inner{
	public void abc() {
		num=9;
	}
}

	


public class Abc {
	public static void main(String[] args) {
		
	
			//Systpublic static void main(String[] args) {
	
		inner.show();
	}
}
