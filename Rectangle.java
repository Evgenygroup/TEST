public class Rectangle extends GeometricalFigure {
    private double length1;
    private double length2;

    public Rectangle(double length1, double length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    public void calculatePerim() {
        this.calculatePerimRectangle();
    }

    public void calculateArea() {
        this.calculateAreaRectangle();
    }

    private void calculatePerimRectangle() {
        perim = 2 * (length1 + length2);
        System.out.println("This rectangle's perimeter =" + perim);
    }

    private void calculateAreaRectangle() {
        area = length1 * length2;
        System.out.println("This square's area =" + area);
    }

    public String toString() {
        return super.toString() + "rectangle{" +
                "Side1=" + length1 +
                " ,Side2=" + length2 + "}";
    }

}
