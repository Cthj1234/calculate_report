package Calculator;

import java.util.ArrayList;

public class Calculator {
    public  ArrayList<Integer> list = new ArrayList<>();

    public int calculate (int firstNum, int secondNum, char operator) {
        switch (operator) {
            case ('+'):
                return firstNum + secondNum;
            case ('-'):
                return firstNum - secondNum;
            case ('*'):
                return firstNum * secondNum;
            case ('/'):
                try {
                    if (secondNum == 0) throw new DevideZeroException();
                    int result = firstNum / secondNum;
                    return result;
                } catch (DevideZeroException e) {
                    System.out.println(e.getMessage());
                }
            default:
                throw new NotCorrectOperatorException();
        }
    }
}