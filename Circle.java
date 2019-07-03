public class Circle extends GeometricalFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculatePerim() {
        this.calculatePerimCircle();
    }

    public void calculateArea() {
        this.calculateAreaCircle();
    }

    private void calculatePerimCircle() {
        perim = 2 * Math.PI * radius;
        System.out.println("This circle's perimeter =" + perim);
    }

    private void calculateAreaCircle() {
        area = Math.PI * radius * radius;
        System.out.println("This circle's area =" + area);
    }

    @Override
    public String toString() {
        return super.toString() + "circle{" +
                "Radius=" + radius +
                '}';
    }
}
