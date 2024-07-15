
abstract class Shape implements Scalable {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computePerimeter();

    public abstract double computeArea();

    @Override
    public String toString() {
        return name + ": Area = " + computeArea() + ", Perimeter = " + computePerimeter();
    }
}
