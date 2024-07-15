
public class Demo {

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Ellipse(10, 5),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
