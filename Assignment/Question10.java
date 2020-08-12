import java.util.Arrays;
import java.util.Scanner;
public class Question10 {
	public static void main(String[] args){
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  5 Numbers");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("The sorted Array : "+Arrays.toString(arr));
		
	}
}
