package solid.ocp.solution.real;

import javax.swing.*;
import java.awt.*;

public class Canvas {

    private final JFrame frame;

    private final Graphics2D graphics2D;

    public Canvas() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        graphics2D = (Graphics2D) frame.getGraphics();
    }

    public void draw(Shape shape) {
        shape.draw(graphics2D);
    }

}
