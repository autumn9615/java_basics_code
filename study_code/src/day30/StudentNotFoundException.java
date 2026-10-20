package day30;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(){
        // 自定义异常
        super("Student Not Found");
    }
}
