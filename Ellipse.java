
public class Ellipse extends Shape {

    private double majorAxis;
    private double minorAxis;

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a > b) {
            this.majorAxis = a;
            this.minorAxis = b;
        } else {
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (majorAxis + minorAxis);
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }
}
