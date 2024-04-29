package Calculator;

public class AddOperator implements Operator{

    @Override
    public int operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

}