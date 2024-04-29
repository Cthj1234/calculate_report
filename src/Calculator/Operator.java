package Calculator;

// Interface를 이용한 OCP 원칙 준수.
public interface Operator {
    int operate(int firstNum, int secondNum);
}
