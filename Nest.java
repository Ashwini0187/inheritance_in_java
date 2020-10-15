package inheritance;

import java.util.Scanner;
  abstract class Writer{
		public abstract void write();// {
			//System.out.println("i am abstract");
		//}
 }	

class Pen extends Writer {
	public void write() {
		System.out.println("i am pen");
	}
}

class Pencil  extends Writer  {
	public void write() {
		System.out.println("i am pencil");
}
}
class Kit {
	public void dosomthing(Writer pc) {
		pc.write();
	}
}
public class Nest {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	Kit k=new Kit();
	
Writer g=new Pen();
	g.write();
	Writer pc=new Pencil();
	k.dosomthing(g);
	//pc.write();
	}	
	}	


