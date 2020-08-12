import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements of array :");
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int totalElements = 0;
		for(int i=0; i<arr.length; i++){
			int rowCount = 0;
			for(int j=0; j<arr.length; j++){
				rowCount++;
			}
			totalElements += rowCount;
			
			System.out.println("The no.of elements in Row "+i + " is " + rowCount);	
		}
		System.out.println("The no.of elements in array is "+ totalElements);	

	}

}
