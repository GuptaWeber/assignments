
public class CommerceStudent extends Student {

	
	private String majorSubject;
	private String collegeName;
	
	public boolean equals(Object obj){
		
		CommerceStudent commerceStudent = (CommerceStudent) obj;
		return super.equals(obj) && this.majorSubject.equals(commerceStudent.getMajorSubject()) && this.collegeName.equals(commerceStudent.getCollegeName()) ;
	}
	
	public void display() {
		super.display();
		System.out.println("CommerceStudent [majorSubject=" + majorSubject + ", collegeName=" + collegeName + "]");
	}
	public CommerceStudent(String name, String rollNo, String majorSubject, String collegeName) {
		super(name, rollNo);
		this.majorSubject = majorSubject;
		this.collegeName = collegeName;
	}
	public CommerceStudent(String name, String rollNo) {
		super(name, rollNo);
	}
	public String getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	
}
