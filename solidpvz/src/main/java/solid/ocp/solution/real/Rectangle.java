package solid.ocp.solution.real;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Rectangle implements Shape {

    private int width;

    private int height;

    public Rectangle(int width, int height) {
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
        return width * height;
    }

    @Override
    public void draw(Graphics2D g) {
        java.awt.Shape circle = new java.awt.Rectangle(100, 100, width, height);
        g.draw(circle);
    }

}
