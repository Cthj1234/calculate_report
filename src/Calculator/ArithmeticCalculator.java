package Calculator;


public class ArithmeticCalculator<T extends Number> extends Calculator {
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
                if (secondNum.doubleValue() == 0) throw new DevideZeroException();
                return (T) new DivideOperator(type).operate(firstNum, secondNum);
            case MOD:
                if (secondNum.doubleValue() == 0) throw new DevideZeroException();
                return (T) new ModOperator(type).operate(firstNum, secondNum);
            default:
                throw new NotCorrectOperatorException();
        }

    }

    @Override
    double calculate(int r) {
        return 0;
    }

    // 람다식 활용 (3-3 마지막)하여 입력값보다 큰 값들 조회하는 메소드
    public void searchUpperFindNum(double tmpNum) {
        super.getList().stream()
                .filter(result -> (double) result > tmpNum)
                .forEach(result -> System.out.println(tmpNum + "을 초과하는 값 : " + result));
    }
}
