package solid.ocp.solution;

public class Triangle implements Shape {

    private int width;

    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0.5 * width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }

}
