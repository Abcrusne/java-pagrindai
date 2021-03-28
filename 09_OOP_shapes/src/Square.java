public class Square extends Rectangle {
	private double side;
//	ArrayList<Shape> objects = new ArrayList<Shape>();

	public Square() {
		super();
		this.side = 1.0;
	}

	public Square(double side) {
		super(side, side);
		this.side = side;
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getSide() * getSide();
//		return super.getArea();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return getSide() * 4;
//		return super.getPerimeter();
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return getWidth();
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return getLength();
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
//		this.width =  width;
		super.setWidth(side);
	}

	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
//		this.length = length;
		super.setLength(side);
	}

	public double getSide() {
		return super.getWidth();
	}

	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	@Override
	public String toString() {
		return "A Square with side " + getSide() + " which is a subclass of " + super.toString();
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
