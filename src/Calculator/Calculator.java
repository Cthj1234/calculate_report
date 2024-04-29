package Calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> list = new ArrayList<>();

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

    //첫번째 값 삭제하는 메소드 추가
    public void removeResult() {
        this.list.remove(0);
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }

    public void setList(int add_Number) {
        this.list.add(add_Number);
    }
}