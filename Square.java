public class Square extends GeometricalFigure {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public void calculatePerim() {
        this.calculatePerimSquare();
    }

    public void calculateArea() {
        this.calculateAreaSquare();
    }

    private void calculatePerimSquare() {
        perim = 4 * length;
        System.out.println("This square's perimeter =" + perim);
    }

    private void calculateAreaSquare() {
        area = length * length;
        System.out.println("This square's area =" + area);
    }

    @Override
    public String toString() {
        return super.toString() + "square{" +
                "Side=" + length +
                '}';
    }
}
