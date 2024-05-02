package Calculator;


public class ArithmeticCalculator <T extends Number> extends Calculator {

    @Override
    double calculate() {
        return 0;
    }

    private final Class<T> type;

    public ArithmeticCalculator(Class<T> type) {
        this.type = type;
    }

    public T calculate(T firstNum, T secondNum, char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        switch (operatorType) {
            case ADD:
                return (T) new AddOperator(type).operate(firstNum, secondNum);
            case SUBTRACT:
                return (T) new SubtractOperator(type).operate(firstNum, secondNum);
            case MULTIPLY:
                return (T) new MultiplyOperator(type).operate(firstNum, secondNum);
            case DIVIDE:
                if(secondNum.doubleValue() == 0) throw new DevideZeroException();
                return (T) new DivideOperator(type).operate(firstNum, secondNum);
            case MOD:
                if(secondNum.doubleValue() == 0) throw new DevideZeroException();
                return (T) new ModOperator(type).operate(firstNum, secondNum);
            default:
                throw new NotCorrectOperatorException();
        }

    }

    @Override
    double calculate(int r) {
        return 0;
    }
}
