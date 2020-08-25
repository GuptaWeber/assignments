
public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(5);
		Square square = new Square(10);
		Rectangle rectange = new Rectangle(7,8);
		
		System.out.println("The Area of Circle is "+ circle.area());
		System.out.println("The Perimeter of Circle is "+ circle.perimeter());
		System.out.println("The Area of Square is "+ square.area());
		System.out.println("The Perimeter of Square is "+ square.perimeter());
		System.out.println("The Area of Rectangle is "+ rectange.area());
		System.out.println("The Preimeter of Rectangle is "+ rectange.perimeter());
	}

}
