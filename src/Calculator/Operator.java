package Calculator;

// Interface를 이용한 OCP 원칙 준수.
public interface Operator<T extends Number> {
    T operate(T firstNum, T secondNum);
}
