
public class SalaryEmployee extends Employee{
	
	private long salary;
	private double incentives;
	private double ta;
	
	
	public SalaryEmployee(){
		salary = 404040;
		incentives = 2030.30;
		ta = 330.33;
	}
	

	public SalaryEmployee(int empId, String empName, long salary, double incentives, double ta) {
		super(empId, empName);
		this.salary = salary;
		this.incentives = incentives;
		this.ta = ta;
	}



	public void display() {
		super.display();
		System.out.println("SalaryEmployee [salary=" + salary + ", incentives=" + incentives + ", ta=" + ta + "]");
	}
	
	long totalSalary(){
		
		return (long) (salary+(new Double(incentives)).longValue()+ta);
	}
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	
}
