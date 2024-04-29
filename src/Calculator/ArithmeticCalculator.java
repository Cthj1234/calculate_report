package Calculator;

public class ArithmeticCalculator extends Calculator {

    @Override
    double calculate() {
        return 0;
    }


    double calculate(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case ('+'):
                return new AddOperator().operate(firstNum, secondNum);
            case ('-'):
                return new SubtractOperator().operate(firstNum, secondNum);
            case ('*'):
                return new MultiplyOperator().operate(firstNum, secondNum);
            case ('/'):
                if (secondNum == 0) throw new DevideZeroException();
                return new DivideOperator().operate(firstNum, secondNum);
            default:
                throw new NotCorrectOperatorException();
        }

    }

    @Override
    double calculate(int r) {
        return 0;
    }
}
