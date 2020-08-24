
public class SingleObject {
	public static void main(String[] args){
		

		StudentManipulation stuMani = new StudentManipulation(); 
		
		Student[] students = stuMani.createStudents();
		
		students[0].display();

	}
}
