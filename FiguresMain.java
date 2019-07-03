public class FiguresMain {

    public static void main(String[] args) {

        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle((76));
        Square square1 = new Square(23);
        Square square2 = new Square(2);
        Square square3 = new Square(345);
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(15, 40);
        Rectangle rectangle3 = new Rectangle(30, 80);

        GeometricalFigure[] geometricalFigures = {circle1, circle2, circle3, square1, square2, square3,
                rectangle1, rectangle2, rectangle3};
        for (int i = 0; i < geometricalFigures.length; i++) {
            System.out.println(geometricalFigures[i]);
            geometricalFigures[i].calculatePerim();
            geometricalFigures[i].calculateArea();
            System.out.println("_________________________");
        }


    }
}

