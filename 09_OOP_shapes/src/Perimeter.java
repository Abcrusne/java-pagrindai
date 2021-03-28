import java.util.ArrayList;

public class Perimeter {
	ArrayList<Shape> objects = new ArrayList<Shape>();

	public Perimeter() {

	}

	public void add(Shape shape) {
		objects.add(shape);
	}

	public boolean isEmpty() {
		return objects.isEmpty();

	}

	public ArrayList<Shape> getShape() {
		return objects;
	}

	public Shape longestPerimeter() {
		ArrayList<Shape> objects = new ArrayList<Shape>();
		Shape longestPerim = objects.get(0);
		for (Shape elements : objects) {
			if (longestPerim.getPerimeter() < elements.getPerimeter()) {
				longestPerim = elements;
			}
		}
		return longestPerim;
	}

	@Override
	public String toString() {
		return "Perimeter [objects=" + objects + ", isEmpty()=" + isEmpty() + ", getShape()=" + getShape()
				+ ", longestPerimeter()=" + longestPerimeter();
	}

}
