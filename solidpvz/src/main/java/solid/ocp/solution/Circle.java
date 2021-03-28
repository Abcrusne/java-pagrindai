package solid.ocp.solution;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
