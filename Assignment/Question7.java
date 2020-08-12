import java.util.Arrays;

public class Question7 {
	public static void main(String[] agrs){
		float f1[] = {1,2,3,4,5};
		float f2[] = {6,7,8,9,10};
		
		for(int i=0; i<5; i++){
			f2[i] = f1[i];
		}
		
		System.out.println("The copied array: "+ Arrays.toString(f2));
		
	}
}
