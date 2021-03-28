package solid.ocp.solution.real;

import java.awt.*;
import java.awt.geom.Ellipse2D;

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
    public void draw(Graphics2D g) {
        java.awt.Shape circle = new Ellipse2D.Double(200 - radius, 200 - radius, radius, radius);
        g.draw(circle);
    };
}
