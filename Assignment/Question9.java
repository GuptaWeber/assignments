import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newBalance = 0;
		int count = 0;
		int yearlyContribution, interest;
		double target;
		double totalAmount=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much is target for you to retire");
		target = sc.nextInt();
		System.out.println("What is your yearly contribution");
		yearlyContribution = sc.nextInt();
		System.out.println("What is the rate of interest");
		interest = sc.nextInt();		
		
		while(true){
			totalAmount = (totalAmount + yearlyContribution) *(1 + interest/100);
			count++;
			System.out.println("The sum of money after year "+ count +" is" + totalAmount);
			if(totalAmount >= target){
				break;
			}
			
		}
		
		System.out.println("You have to work "+ count+" years to retire");
		
		
	}

}
