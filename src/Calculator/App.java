package Calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int index = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int firstNum, secondNum;
            char operator = ' ';

            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            secondNum = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            operator = sc.next().charAt(0);

            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            switch (operator){
                case('+'):
                    result = firstNum + secondNum;
                    break;
                case('-'):
                    result = firstNum - secondNum;
                    break;
                case('*'):
                    result = firstNum * secondNum;
                    break;
                case('/'):
                    try{
                        result = firstNum / secondNum;
                    }catch (Exception e){
                        System.out.println("나누는 숫자로 0을 입력하였습니다.");
                        continue;
                    }

            }
            System.out.println("결과: " + result);

            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            list.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            /* 위 요구사항에 맞게 구현 */
            if(Objects.equals(sc.next(), "remove")) list.remove(0);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* 위 요구사항에 맞게 구현 */
            if(Objects.equals(sc.next(), "inquiry")){
                for(int answer : list) System.out.println(answer);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            if(Objects.equals(sc.next(), "exit")) break;
        }

    }
}