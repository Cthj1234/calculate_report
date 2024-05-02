package Calculator;


public class ArithmeticCalculator extends Calculator {

    @Override
    double calculate() {
        return 0;
    }


    @Override
    double calculate(int firstNum, int secondNum, char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        switch (operatorType) {
            case ADD:
                return new AddOperator().operate(firstNum, secondNum);
            case SUBTRACT:
                return new SubtractOperator().operate(firstNum, secondNum);
            case MULTIPLY:
                return new MultiplyOperator().operate(firstNum, secondNum);
            case DIVIDE:
                if (secondNum == 0) throw new DevideZeroException();
                return new DivideOperator().operate(firstNum, secondNum);
            case MOD:
                if(secondNum == 0) throw new DevideZeroException();
                return new ModOperator().operate(firstNum, secondNum);
            default:
                throw new NotCorrectOperatorException();
        }

    }

    @Override
    double calculate(int r) {
        return 0;
    }
}
