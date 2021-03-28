package solid.ocp.problem;

/**
 * Demonstruojama klasė, kuri pažeidžia OCP principą.
 *
 * Norint pridėti naują figūrą, privalome modifikuoti klasę Canvas.
 */
public class Canvas {

    public void draw(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Drawing circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("Drawing rectangle");
        } else if (shape instanceof Triangle) {
            System.out.println("Drawing triangle");
        } else {
            throw new IllegalArgumentException("Unrecongnized shape type");
        }
    }

}
