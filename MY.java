package inheritance;

interface N{
	void m1();
}

public class MY {
N m1(){
	return new N() {
		public void m1() {
			System.out.println("hello users");
		}
		
	};
}

public static void main(String[] args) {
	N ok= new My().m1();
	N h=ok.m1();
	ok.m1(h);
}
}
