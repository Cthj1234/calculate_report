package Calculator;

public class DevideZeroException extends RuntimeException{
    public DevideZeroException() {
        super("0으로 나눌 수 없습니다.");
    }
}
