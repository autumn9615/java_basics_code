package day30;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message){
        // 自定义异常
        super("Student Not Found");
    }
}
