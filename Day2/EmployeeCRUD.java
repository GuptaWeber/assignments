import java.util.Scanner;

class Employee{
	private int empid;
	private String ename;
	private int salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class EmployeeCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 2;
		Employee emp[] = new Employee[count];
		
		/* Create Emp */
		
		for(int i=0;i<count;i++){
			emp[i] = new Employee();
			System.out.println("Enter Employee Id");
			emp[i].setEmpid(sc.nextInt());
			System.out.println("Enter Employee Name");
			emp[i].setEname(sc.next());
			System.out.println("Enter Employee Salary");
			emp[i].setSalary(sc.nextInt());
		}
		
		/* Update Details */
		System.out.println("Enter the empid which you want to update");
		int tempId = sc.nextInt();
		for(int i=0;i<count;i++){
			if(tempId == emp[i].getEmpid()){
				System.out.println("Enter New Employee Name");
				emp[i].setEname(sc.next());
				System.out.println("Enter New Employee Salary");
				emp[i].setSalary(sc.nextInt());
				
				System.out.println("The New Employee Details are : ");
				System.out.println(emp[i].getEmpid() + emp[i].getEname() + emp[i].getSalary());
				break;
			}
		}
		
		/* Display Details */
		
		for(int i=0;i<count;i++){
			System.out.println("The Employee Details of index"+ i + " are : ");
			System.out.println("Emp id: "+ emp[i].getEmpid() + " Emp Name: " + emp[i].getEname() + " Emp Salary: "+ emp[i].getSalary());
		}
		

		
		/* Delete a Record */
		int index=0;
		System.out.println("Enter the empid which you want to Delete");
		int tempEmpId = sc.nextInt();
		for(int i=0;i<count;i++){
			if(tempEmpId == emp[i].getEmpid()){
				index = i;
			}
		}
		
		if(index == count-1){
			emp[count-1].setEmpid(0);
			emp[count-1].setEname("");
			emp[count-1].setSalary(0);
		}else{
			for(int i= index; i<count-1; i++){
				System.out.println(index);
				emp[i].setEmpid(emp[i+1].getEmpid());
				emp[i].setEname(emp[i+1].getEname());
				emp[i].setSalary(emp[i+1].getSalary());
				System.out.println(emp[i].getEname());
			}
			emp[count-1].setEmpid(0);
			emp[count-1].setEname("");
			emp[count-1].setSalary(0);
		}
		
		/* Display Details */
		
		for(int i=0;i<count;i++){
			System.out.println("The Employee Details of index"+ i + " are : ");
			if(emp[i].getEmpid()!=0){
				System.out.println("Emp id: "+ emp[i].getEmpid() + " Emp Name: " + emp[i].getEname() + " Emp Salary: "+ emp[i].getSalary());
			}
			
		}
		
	}

}
