package sqli.shapes;

import java.io.StringWriter;

public class Shapes {

    public static final String SQUARE = "SQUARE";
    public static final String TRIANGLE = "TRIANGLE";
    public static final String RECTANGLE = "RECTANGLE";
    
    private final StringWriter out;

    public Shapes(StringWriter out) {
        this.out = out;
    }

    public void area(String shape, String dimensions) {
        int[] dims = adapt(dimensions);
        out.write(String.valueOf(AreaCalculatorFinder.find(shape).calculate(dims[0], dims[1])));
    }

    private int[] adapt(String dimensions) {
        String[] dims = dimensions.split(",");
        if (dims.length < 2) {
            return new int[]{Integer.parseInt(dims[0]), Integer.parseInt(dims[0])};
        }
        return new int[]{Integer.parseInt(dims[0]), Integer.parseInt(dims[1])};
    }

}
