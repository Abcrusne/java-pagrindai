public abstract class Shape {
	private String color = "red";
	private boolean filled = true;
//	ArrayList<Shape> objects = new ArrayList<Shape>();

	public Shape() {
//		super();
	}

	public abstract double getArea();

	public abstract double getPerimeter();

//	public abstract void add(Shape shape);
//
//	public abstract boolean isEmpty();
//
//	public abstract ArrayList<Shape> getShape();
//
//	public abstract Shape longestPerimeter();

	public Shape(String color, boolean filled) {
//		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		String isNot = "";
		if (isFilled() == false) {
			isNot = "not";
		}
		return "A shape with color of " + color + ", and " + isNot + "filled.";
	}

}
