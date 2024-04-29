package Calculator;

public class ArithmeticCalculator extends Calculator {

    @Override
    double calculate() {
        return 0;
    }
    
    //오버로딩을 통한 사칙연산
    double calculate(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case ('+'):
                return firstNum + secondNum;
            case ('-'):
                return firstNum - secondNum;
            case ('*'):
                return firstNum * secondNum;
            case ('/'):
                if (secondNum == 0) throw new DevideZeroException();
                return firstNum / secondNum;
            default:
                throw new NotCorrectOperatorException();
        }
    }

    @Override
    double calculate(int r) {
        return 0;
    }
}
