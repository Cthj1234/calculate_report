package Calculator;

public class CircleCalculator extends Calculator {

    private static final double PI = 3.14;

    @Override
    double calculate(int r) {
        return r * r * PI;
    }
}
