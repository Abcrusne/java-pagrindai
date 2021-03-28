import java.util.ArrayList;

public class Main {

//	public Shape longestPerimeter() {
//		ArrayList<Shape> objects = new ArrayList<Shape>();
//		Shape longestPerim = objects.get(0);
//		for (Shape shape : objects) {
//			if (longestPerim.getPerimeter() < shape.getPerimeter()) {
//				longestPerim = shape;
//			}
//		}
//		return longestPerim;
//	}

	public static void main(String[] args) {

//		Shape s1 = new Shape("blue", false); is abstrakcios 
//		klases negaliu objekto sukurt
//		Triangle s1 = new Triangle();
		Circle s2 = new Circle();

//		System.out.println(s2.toString());

		Circle c1 = new Circle(2);
//		System.out.println(c1.toString());

		Square sq = new Square(2);
//		System.out.println(sq.toString());

		Rectangle r1 = new Rectangle(4, 2);

		if ((s2.getPerimeter()) > c1.getPerimeter() && (s2.getPerimeter()) > sq.getPerimeter()
				&& (s2.getPerimeter()) > r1.getPerimeter()) {
			System.out.println("Circle has largest perimeter: " + s2.getPerimeter());
		} else if ((c1.getPerimeter()) > s2.getPerimeter() && (c1.getPerimeter()) > sq.getPerimeter()
				&& (c1.getPerimeter()) > r1.getPerimeter()) {
			System.out.println("Circle has largest perimeter: " + c1.getPerimeter());
		} else if ((sq.getPerimeter()) > sq.getPerimeter() && (sq.getPerimeter()) > c1.getPerimeter()
				&& (sq.getPerimeter()) > r1.getPerimeter()) {
			System.out.println("Square has largest perimeter: " + sq.getPerimeter());
		} else {
			System.out.println("Rectangle has largest perimeter: " + r1.getPerimeter());
		}
//		System.out.println(r1.toString());
//	create arraylist and insert into it objects
		ArrayList<Shape> objects = new ArrayList<Shape>();
		objects.add(s2);
		objects.add(c1);
		objects.add(sq);
		objects.add(r1);

//		Perimeter longestPer = new Perimeter();
//		longestPer.add(s2);
//		longestPer.add(c1);
//		longestPer.add(sq);
//		longestPer.add(r1);
//		System.out.println(longestPer.toString());
//
//		System.out.println(objects);
		for (Shape shape : objects) {
			System.out.println(shape);
		}

//		for (Shape shape : objects) {
//if (shape instanceof Rectangle) {sout(((Rectangle) shape). getArea()); else su circle}
//		}
		System.out.println("Circle area: " + s2.getArea() + " Circle area: " + c1.getArea() + " Square area: "
				+ sq.getArea() + " Rectangle area: " + r1.getArea());
		System.out.println("Circle perimeter: " + s2.getPerimeter() + " Circle perimeter: " + c1.getPerimeter()
				+ " Square perimeter: " + sq.getPerimeter() + " Rectangle perimeter: " + r1.getPerimeter()
				+ " Longest: ");
		System.out.println("Side of square: " + sq.getSide());
//
	}

}
