
public class BscStudent extends Student {

	private String specialization;
	private String collegeName;
	
	
	public boolean equals(Object obj){
		
		BscStudent bscStudent = (BscStudent) obj;
		return super.equals(obj) && this.specialization.equals(bscStudent.getSpecialization()) && this.collegeName.equals(bscStudent.getCollegeName()) ;
	}
	
	
	
	public void display() {
		super.display();
		System.out.println("BscStudent [specialization=" + specialization + ", collegeName=" + collegeName + "]");
	}

	public BscStudent(String name, String rollNo, String specialization, String collegeName) {
		super(name, rollNo);
		this.specialization = specialization;
		this.collegeName = collegeName;
	}

	public BscStudent(String name, String rollNo) {
		super(name, rollNo);
	}

	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
