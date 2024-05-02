package Calculator;

public class DivideOperator <T extends Number> implements Operator<T> {

    public final Class<T> type;

    public DivideOperator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T operate(T firstNum, T secondNum) {
        if (secondNum.doubleValue() == 0) {
            throw new ArithmeticException("0으로는 나눌 수 없습니다.");
        }
        double result = firstNum.doubleValue() / secondNum.doubleValue();
        return NumberConversionUtils.convertNumberToType(result, type);
    }
}