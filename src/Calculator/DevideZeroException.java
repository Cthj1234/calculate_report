package Calculator;

public class DevideZeroException extends Exception{
    public DevideZeroException() {
        super("0으로 나눌 수 없습니다.");
    }
}
