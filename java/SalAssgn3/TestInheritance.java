
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WageEmployee w = new WageEmployee();
//		
//		w.display();
	
		//WageEmployee w1 = new WageEmployee(404, "Not Found", 201, 10);
		
		//SalaryEmployee s1 = new SalaryEmployee();
		SalaryEmployee s2 = new SalaryEmployee(404, "Not Found", 2020, 20,20);
		
		s2.display();
		
		System.out.println(s2.totalSalary());
		
//		w1.display();
	
	}

}
