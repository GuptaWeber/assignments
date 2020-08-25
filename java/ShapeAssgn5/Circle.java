
public class Circle extends Shape implements Calculation {
	
	private int radius;

	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		radius = 3;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius;
	}

}
