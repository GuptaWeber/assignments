
public class Student{
	
	
	private String name;
	private String identifier;
	private int age;
	private int standard;
	private int marksOfSub1;
	private int marksOfSub2;
	private int marksOfSub3;

	
	
	public Student(){
		name = "TestName";
		identifier = "Hello";
		age = 20;
		standard = 4;
		marksOfSub1  = 90;
		marksOfSub2  = 86;
		marksOfSub3  = 99;
	}
	
	public Student(String name, String identifier, int age, int standard, int marksOfSub1, int marksOfSub2, int marksOfSub3 ){
		this.name = name;
		this.identifier = identifier;
		this.age = age;
		this.standard = standard;
		this.marksOfSub1 = marksOfSub1;
		this.marksOfSub2 = marksOfSub2;
		this.marksOfSub3 = marksOfSub3;
	}
	
	public int total(){
		return marksOfSub1 + marksOfSub2 + marksOfSub3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getidentifier() {
		return identifier;
	}

	public void setidentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}



	
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getMarksOfSub1() {
		return marksOfSub1;
	}

	public void setMarksOfSub1(int marksOfSub1) {
		this.marksOfSub1 = marksOfSub1;
	}

	public int getMarksOfSub2() {
		return marksOfSub2;
	}

	public void setMarksOfSub2(int marksOfSub2) {
		this.marksOfSub2 = marksOfSub2;
	}

	public int getMarksOfSub3() {
		return marksOfSub3;
	}

	public void setMarksOfSub3(int marksOfSub3) {
		this.marksOfSub3 = marksOfSub3;
	}

	public void display	(){
		System.out.println("Name "+ name);
		System.out.println("Identifier "+ identifier);
		System.out.println("Age "+ age);
		System.out.println("Standard  "+ standard);
		System.out.println("Marks of Subject 1: " + marksOfSub1);
		System.out.println("Marks of Subject 2: " + marksOfSub2);
		System.out.println("Marks of Subject 3: " + marksOfSub3);
	}
	
}


