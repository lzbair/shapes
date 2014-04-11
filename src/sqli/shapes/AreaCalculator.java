package sqli.shapes;

import java.util.function.Function;

@FunctionalInterface
public interface AreaCalculator {
    int calculate(int x, int y);
    
     default AreaCalculator composeWith(Function<Integer, Integer> component) {
         return (x, y) -> component.apply(this.calculate(x, y));
    }
}
