
public class Rectangle extends Shape implements Calculation {
	
	private int length,breadth; 
	
	

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		length = 5;
		breadth = 4;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double area() {
		// TODO Auto-generated method stub
		return length * breadth ;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * length * breadth;
	}

}
