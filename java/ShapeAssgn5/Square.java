
public class Square extends Shape implements Calculation {
	
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Square() {
		length = 4;
	}

	public Square(int length) {
		super();
		this.length = length;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * length;
	}

}
