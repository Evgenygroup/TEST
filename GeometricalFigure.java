public abstract class GeometricalFigure {
    protected double area;
    protected double perim;

    public GeometricalFigure() {
    }

    public abstract void calculatePerim();

    public abstract void calculateArea();

    @Override
    public String toString() {
        return "This geometrical figure is ";
    }
}
