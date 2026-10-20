package day30;

public class Student {
    // 定义学生类
    // 姓名
    private String name;
    // 学号
    private String id;
    // 成绩
    private double score;
    // 生日
    private String birthday;
    // 提供空参构造和全参构造
    public Student(){};
    public Student(String name, String id, double score, String birthday) {
        this.name = name;
        this.id = id;
        this.score = score;
        this.birthday = birthday;
    }
    // getter和setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "姓名：" + this.getName() + "学号：" + this.getId() + "成绩：" + this.getScore() + "生日：" + this.getBirthday();
    }
}
