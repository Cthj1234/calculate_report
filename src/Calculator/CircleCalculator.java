package Calculator;

public class CircleCalculator extends Calculator{

    @Override
    double calculate() {
        return 0;
    }


    @Override
    double calculate(int r) {
        return r *r * pi;
    }
}
