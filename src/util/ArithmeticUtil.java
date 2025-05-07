package util;

public class ArithmeticUtil {

    public double calculateArea(Shape shape, double... dimensions) {
        return switch (shape) {
            case Shape.CIRCLE -> Math.PI * dimensions[0] * dimensions[0];
            case Shape.RECTANGLE -> dimensions[0] * dimensions[1];
            case Shape.TRIANGLE -> dimensions[0] * dimensions[1] / 2;
        };
    }
}
