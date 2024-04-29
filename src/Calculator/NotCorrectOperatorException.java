package Calculator;

public class NotCorrectOperatorException extends RuntimeException{
    public NotCorrectOperatorException() {
        super("올바른 사칙연산 기호를 입력해주세요");
    }
}
