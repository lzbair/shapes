package sqli.shapes;


public class AreaCalculatorFinder {

    public static AreaCalculator find(String shape) {

        AreaCalculator cal = null;
        switch (shape) {
            case Shapes.RECTANGLE:
            case Shapes.SQUARE:
                cal = (x, y) -> x * y;
                break;

            case Shapes.TRIANGLE:
                cal = AreaCalculatorFinder.find(Shapes.RECTANGLE).composeWith((Integer x) -> x / 2);
                break;
        }
        return cal;
    }

}
