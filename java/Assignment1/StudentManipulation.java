
public class StudentManipulation {

	
	Student[] createStudents(){
		Student[] students = new Student[5];
		students[0] = new Student("Rama","student1", 17, 11, 95,96,97);
		students[1] = new Student("Krishna","student2", 13, 6, 88,83,90);
		students[2] = new Student("Ravan","student3", 20, 12, 50,40,60);
		students[3] = new Student("Lakshman","student4", 16, 4, 90,70,95);
		students[4] = new Student("Arjun","student5", 15, 7, 60,65,44);
		return students;
		
	}
	
	public int findMax(Student[] students){
			
		int max = 0;
		
		for(Student s : students){
			
			if(s.total()> max){
				max = s.total();
			}
			
		}

		return max;
		
	}
}
