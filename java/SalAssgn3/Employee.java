
public class Employee {
	private int empId;
	private String empName;
	
	
	public Employee(){
		System.out.println("Emp");
		empId = 1234;
		empName = "Default";
	}
	
	public Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public void display(){
		System.out.println("The emp id is "+empId + " The EmpName is "+ empName);
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
