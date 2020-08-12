
public class Question8 {
	public static void main(String[] args){
	
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];
		
		float f1 = Float.parseFloat(str1);
		float f2 = Float.parseFloat(str3);
	
		
		if(str2.equals("+")){
			System.out.println("The addition is "+ (f1+f2));
		}else if(str2.equals("-")){
			System.out.println("The subtraction is " + (f1-f2));
		}else if(str2.equals("*")){
			System.out.println("The multiplication is "+ f1*f2);
		}else if(str2.equals("/")){
			System.out.println("The multiplication is "+ f1/f2);
		}
		
		
	}
}
