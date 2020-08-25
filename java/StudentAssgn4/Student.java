
public class Student {
	private String name;
	private String rollNo;
	
	public Student(String name, String rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public Student() {
		super();
	}

	public void display() {
		System.out.println("Student [name=" + name + ", rollNo=" + rollNo + "]");
	}
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	
	public boolean equals(Object obj){

		Student student = (Student) obj;	
		return  this.getName().equals(student.getName()) &&  this.getRollNo().equals(student.getRollNo());
		
	}
	
}
