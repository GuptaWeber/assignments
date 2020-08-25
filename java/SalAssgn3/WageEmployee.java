
public class WageEmployee extends Employee {
	
	private int wages;
	private int noOfHrs;
	
	
	public WageEmployee() {
		super();
		System.out.println("Wage Emp");
		wages = 200;
		noOfHrs = 8;
	}


	public WageEmployee(int empId, String name, int wages, int noOfHrs) {
		super(empId, name);
		this.wages = wages;
		this.noOfHrs = noOfHrs;
	}
	
	public void display(){
		super.display();
		System.out.println("Wages :- "+ wages +"\t No.of Hours Worked "+ noOfHrs);
	}


	public int getWages() {
		return wages;
	}


	public void setWages(int wages) {
		this.wages = wages;
	}


	public int getNoOfHrs() {
		return noOfHrs;
	}


	public void setNoOfHrs(int noOfHrs) {
		this.noOfHrs = noOfHrs;
	}
	
	
	
}
