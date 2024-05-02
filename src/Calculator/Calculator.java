package Calculator;

import java.util.ArrayList;


public abstract class Calculator<T extends Number> {
    //접근 제어자 변경
    protected static final double pi = 3.14;
    protected ArrayList<T> list = new ArrayList<>();
    protected ArrayList<Double> circle_list = new ArrayList<>();


    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    /* 생성자 구현 */
    public Calculator() {
        this.list = new ArrayList<>();
        this.circle_list = new ArrayList<>();
    }

    // calculate 추상 메소드 구현
    abstract double calculate();
    // abstract int calculate(int firstNum, int secondNum, char operator);
    abstract double calculate(int r);

    //첫번째 값 삭제하는 메소드 추가
    public void removeResult() {
        this.list.remove(0);
    }

    public void circle_removeResult(){
        this.circle_list.remove(0);
    }

    //결과 값 조회하는 메소드
    public void inquiryResults() {
        for (T num : this.list) {
            System.out.println(num);
        }
    }

    public ArrayList<T> getList() {
        return this.list;
    }

    public void setList(T add_Number) {
        this.list.add(add_Number);
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(int r) {
        /* 원의 넓이 계산 구현 */
        return r * r * pi;
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */

    public ArrayList<Double> getCircle_list() {
        return circle_list;
    }

    public void setCircle_list(double add_number) {
        this.circle_list.add(add_number);
    }

    public void circle_inquiryResults() {
        for (double num : this.circle_list) {
            System.out.println(num);
        }
    }

}