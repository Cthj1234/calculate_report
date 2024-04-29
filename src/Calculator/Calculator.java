package Calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> list = new ArrayList<>();

    //2-6 생성자 메소드(list 초기화) 구현
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    /* 생성자 구현 */
    public Calculator() {
        this.list = new ArrayList<>();
    }

    public int calculate(int firstNum, int secondNum, char operator) {
        switch (operator) {
            case ('+'):
                return firstNum + secondNum;
            case ('-'):
                return firstNum - secondNum;
            case ('*'):
                return firstNum * secondNum;
            case ('/'):
                if (secondNum == 0) throw new DevideZeroException();
                int result = firstNum / secondNum;
                return result;

            default:
                throw new NotCorrectOperatorException();
        }
    }

    //첫번째 값 삭제하는 메소드 추가
    public void removeResult() {
        this.list.remove(0);
    }

    //결과 값 조회하는 메소드
    public void inquiryResults() {
        for (int num : this.list) {
            System.out.println(num);
        }
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }

    public void setList(int add_Number) {
        this.list.add(add_Number);
    }
}