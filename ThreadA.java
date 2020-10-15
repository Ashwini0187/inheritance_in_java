package inheritance;

public class ThreadA extends Thread{
public synchronized  void start()
{
	//System.out.println("hello " );
}
public void run() {
	System.out.println("hello");
}
}
class ThreadB {
	public static void main(String[] args) {
		ThreadA mat=new ThreadA();
		mat.start();
	}
}