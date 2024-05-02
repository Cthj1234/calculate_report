package Calculator;

public enum OperatorType {

    //ENUM 상수 설정 3-1
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    //Enum부분 튜터님 해설 강의 참고하였음.
    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    /**
     * char operator 값을 받아서 해당하는 OperatorType을 반환하는 정적 메소드 추가
     */
    public static OperatorType fromOperator(char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.symbol == operator) {
                return type;
            }
        }
        throw new IllegalArgumentException("해당하는 연산자 없음" + operator);
    }

}