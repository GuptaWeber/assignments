
public class TestStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] students = new Student[7];
		
		students[0] = new CommerceStudent("Ratnam","123","ECE","KLEF");
		students[1] = new EnggStudent("Gupta","404","ECE","KLEF");
		students[2] = new EnggStudent("Rohit","345","ECE","KLEF");
		students[3] = new BscStudent("Weber","101","Computers","Gowtham");
		students[4] = new BscStudent("Vinay","102","Science","Gowtham");
		students[5] = new CommerceStudent("Lokesh","103","Maths","The Global Commerce");
		students[6] = new CommerceStudent("Vignesh","104","Civics","The Global Commerce");
		
		
		EnggStudent enggStudent1 = new EnggStudent("Weber","345","ECE","Gora");

        CommerceStudent commerceStudent1 = new CommerceStudent("Lokesh","103","Maths","The Global Commerce");

        if(search(students,enggStudent1))
        	System.out.println("Found The Engineering Student");
        else
        	System.out.println("Engineering Student Not Found");
        
        if(search(students, commerceStudent1))
        	System.out.println("Found The Commerce Student");
        else
        	System.out.println("Commerce Student Not Found");	
	}
	
	public static boolean search(Student[] students,Student student){
		for(Student s : students){
			if( s.getClass() == student.getClass() ){
				if(s.equals(student)){
					return true;
				}
			}
		}
		return false;	
	}

}
