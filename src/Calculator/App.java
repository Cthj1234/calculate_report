package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new ArithmeticCalculator();
        Calculator circle_Calculator = new CircleCalculator();

        while(true){
            int firstNum, secondNum;
            char operator = ' ';

            System.out.println("원하는 계산의 종류를 입력해주세요.\n1. 원의넓이\n2. 사칙연산 ");

            int result = 0;
            double circle_result = 0;

            // 원 일 경우
            int tmp = sc.nextInt();
            if (tmp == 1) {
                System.out.println("반지름의 길이를 입력하세요: ");
                circle_result = circle_Calculator.calculateCircleArea(sc.nextInt());
                circle_Calculator.setCircle_list(circle_result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if(Objects.equals(sc.next(), "remove")) circle_Calculator.circle_removeResult();

                System.out.println("원의 넓이를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if(Objects.equals(sc.next(), "inquiry")) circle_Calculator.circle_inquiryResults();
            }
            // 사칙연산 일 경우
            else if (tmp == 2) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                firstNum = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                secondNum = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                operator = sc.next().charAt(0);

                try{
                    result = (int)calculator.calculate(firstNum, secondNum, operator);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    continue;
                }
                calculator.setList(result);
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                /* 위 요구사항에 맞게 구현 */
                if(Objects.equals(sc.next(), "remove")) calculator.removeResult();

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                /* 위 요구사항에 맞게 구현 */
                if(Objects.equals(sc.next(), "inquiry")) calculator.inquiryResults();
            }else {
                System.out.println("1 또는 2만 입력하세요.");
                continue;
            }
            // =======기존 코드========

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            if(Objects.equals(sc.next(), "exit")) break;
        }

    }
}