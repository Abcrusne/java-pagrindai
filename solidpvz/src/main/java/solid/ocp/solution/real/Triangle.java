package solid.ocp.solution.real;

import java.awt.*;

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
    public void draw(Graphics2D g) {
        g.drawLine(100, 100 + height, 100 + width, 100 + height);
        g.drawLine(100, 100 + height, 100 + (width / 2), 100);
        g.drawLine(100 + (width / 2), 100, 100 + width, 100 + height);
    }

}
