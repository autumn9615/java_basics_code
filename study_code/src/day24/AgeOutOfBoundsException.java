package day24;

public class AgeOutOfBoundsException extends RuntimeException{
    // 年龄的格式异常
    public AgeOutOfBoundsException(){}
    public AgeOutOfBoundsException(String message){
        super(message);
    }
}
