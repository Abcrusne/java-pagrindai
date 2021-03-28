public class Circle extends Shape {

	double radius = 1.0;
//	ArrayList<Shape> objects = new ArrayList<Shape>();

	public Circle() {
		super();
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "A Circle with radius " + radius + " which is a subclass of " + super.toString();
	}

//	public void add(Shape shape) {
//		objects.add(shape);
//	}
//
//	public boolean isEmpty() {
//		return objects.isEmpty();
//
//	}
//
//	public ArrayList<Shape> getShape() {
//		return objects;
//	}
//
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

}
