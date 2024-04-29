package Calculator;

public class DivideOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
}