import java.util.Arrays;

class Stack1{
	
	private int size = -1;
	String [] arr = new String[5];
	boolean isEmpty(){
		if(size==0){
			return true;
		}else{
			return false;
		}
	}
	
	void sizeCheck(){
		int newSize = size * 2;
		arr = Arrays.copyOf(arr, newSize);
	}
	
	void push(String element){
		
		if(arr.length<=size+2){
			sizeCheck();
		}
		
		if(size==-1){
			arr[0] = element;
			size = 0;
		}else{
			
			arr[++size] = element;
		}
	}
	
	String pop(){
		String poppedElement = arr[size];
		arr[size] = null;
		size--;
		return poppedElement;
	}
	
	String top(){
		return arr[size];
	}

	@Override
	public String toString() {
		return "Stack [arr=" + Arrays.toString(arr) + "]";
	}
	
}

public class StackImple {
	


	public static void main(String[] args) {
		
		Stack1 st = new Stack1();
		
		st.push("hello");
		st.push("Gupta");
		st.push("Weber");
		st.push("Weber");
		st.push("Weber");
		st.push("Weber");
		System.out.println(st.toString());
		System.out.println("The Element that's popped is "+ st.pop());
		
		System.out.println("The Top most element is "+st.top());
		System.out.println(st.toString());
		
		
	}
	
	
	
	

}
