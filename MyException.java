package inheritance;
import java.util.Scanner;
public class MyException extends Exception{
	

	
		public MyException() {
			super ("default parameter");
		}
		public MyException(String msg) {
			super(msg);
		}
	}s
	class Election{
		void vote(int age)throws MyException{
			if(age>=18) {
				System.out.println("welcome");
			}else {
				throw new MyException("you are not eligible for vote");
			}
		}


	public class Idemo {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your age");
		int age = obj.nextInt();
		obj.close();
	Election e1=new Election();
	try {
		e1.vote(age);
	}catch(MyException e) {
		e.printStackTrace();
	}
	System.out.println("rest of the coda");

			}
			
	}



