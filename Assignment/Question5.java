import java.util.Scanner;
public class Question5 {
	public static void main(String[] args){
		String[] sarr = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
			sarr[i] = sc.next();
		}
		
		for(String str : sarr){
			System.out.println("The average length of first word "+ str + " is" + str.length()/5);
		}
		
		sc.close();
		
	}
}
