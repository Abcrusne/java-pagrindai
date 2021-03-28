public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;
//	ArrayList<Shape> objects = new ArrayList<Shape>();

	public Rectangle() {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return (width * 2) + (length * 2);
	}

	@Override
	public String toString() {
		return "A Rectangle with width " + width + " length " + length + " which is a subclass of " + super.toString();

	}

//
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
