import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double number;
		
		System.out.println("Enter a number that you need square root :");
		
		number = sc.nextInt();
		
		System.out.println("The Square root of "+ number + " is " + Math.sqrt(number));
		sc.close();
		
	}

}

//OUTPUT : Enter a number that you need square root :
//	20
//	The Square root of 20.0 is 4.47213595499958