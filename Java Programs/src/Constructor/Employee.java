package Constructor;

public class Employee {

	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public Employee()
	{
		empId=1;
		empName="Joshna";
		department="Finance";
		salary=350000;
	}
	//parameterized constructor
	public Employee(String empName,String department,float salary)
	{
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	//parameterized constructor
	public Employee(int empId,String empName,String department,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department "+department);
		System.out.println("Salary "+salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1= new Employee(2, "Khalesi", "I.T.", 450000);
		
		e.display();
		e1.display();
	}
}
