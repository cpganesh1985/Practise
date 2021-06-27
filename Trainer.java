package scenario1;

public class Trainer {

	String dept = "Java";
	String institue = "Payiligam";
	int salary = 10000;
	
		
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void training()
	{
	System.out.println("Leaning Java");
		
	}
	public Trainer(String dept, String institue)
	{
	this.dept = dept;
	this.institue = institue;
	}
		
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Trainer Vihas = new Trainer("CSE","Payiligam");	
	
	}



}
