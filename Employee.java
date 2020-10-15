package inheritance;

public class Employee {
	
	private int eno;
	private String name;
	private float per;
	
	public Employee(int eno, String name, float per) {
		
		this.eno = eno;
		this.name = name;
		this.per = per;
	}
	public String tostring() {
		
		return eno+":"+name+":"+per;
		
	}
	public int hashcode() {
		return eno;
	}
		public boolean equals(Object obj) {
			Employee emp=(Employee)obj;
			return this.eno==emp.eno;
		}
}


