package inheritance;




	interface N{
		void m1();
	}

	public class Apple{
	N m1(){
		return new N() {
			public void m1() {
				System.out.println("hello users");
			}
			
		};
	}

	public static void main(String[] args) {
		N ok= new Apple().m1();
	ok.m1();
	}
	}


