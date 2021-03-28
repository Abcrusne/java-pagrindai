package solid.ocp.solution.real;

public class Application {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.draw(new Circle(100));
        canvas.draw(new Rectangle(100, 100));
        canvas.draw(new Triangle(100, 100));
    }

}
