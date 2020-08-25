
public class EnggStudent extends Student{

	private String stream;
	private String collegeName;
	
	
	public boolean equals(Object obj){
		
		EnggStudent enggStudent = (EnggStudent) obj;
		return super.equals(obj) && this.stream.equals(enggStudent.getStream()) && this.collegeName.equals(enggStudent.getCollegeName()) ;
	}
		
	public void display() {
		super.display();
		System.out.println("EnggStudent [stream=" + stream + ", collegeName=" + collegeName + "]");
	}


	public EnggStudent(String name, String rollNo, String stream, String collegeName) {
		super(name, rollNo);
		this.stream = stream;
		this.collegeName = collegeName;
	}
	
	
	public EnggStudent(String name, String rollNo) {
		super(name, rollNo);
	}
	
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
