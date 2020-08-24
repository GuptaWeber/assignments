
public class MultipleStudentObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentManipulation stuMani = new StudentManipulation(); 
		
		Student[] students = stuMani.createStudents();
		
		for(Student i : students){
			i.display();
		}
		
		System.out.println(stuMani.findMax(students));
		
	}

}
