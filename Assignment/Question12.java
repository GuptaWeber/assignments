import java.util.Scanner;
public class Question12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year, month;
		System.out.println("Enter the year: ");
		year = sc.nextInt();
		System.out.println("Enter the Month: ");
		month = sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			System.out.println("The Number of days in the month "+ month + " are 31 days");
		}else if((month == 4 || month == 6 || month == 9 || month == 11)){
			System.out.println("The Number of days in the month "+ month + " are 30 days");
		}else if(isLeap(year)){
			System.out.println("The Number of days in the month "+ month + " are 29 days");
		}else{
			System.out.println("The Number of days in the month "+ month + " are 28 days");
		}
		
		
	}
	
	static boolean isLeap(int year){
		
		if(year%4==0){
			return true;
		}else{
			return false;
		}
	}
	
}
