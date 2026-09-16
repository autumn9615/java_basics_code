package day24;

public class NameFormatException extends RuntimeException{
    // 姓名长度或年龄范围异常
    public NameFormatException(){}
    public NameFormatException(String message){
        super(message);
    }
}
