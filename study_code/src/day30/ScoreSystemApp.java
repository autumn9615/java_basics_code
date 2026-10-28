package day30;

import java.time.LocalDate;
import java.util.Map;

public class ScoreSystemApp {
    public static void main(String[] args){
        // 程序主入口
        // 步骤 1：new StudentService，addStudent 预置 4-5 个学生
        Student s1 = new Student("张三","S001",95, LocalDate.parse("2005-03-15"));
        Student s2 = new Student("李四","S002",85, LocalDate.parse("2005-12-08"));
        Student s3 = new Student("王五","S003",72, LocalDate.parse("2004-10-20"));
        Student s4 = new Student("赵六","S004",58, LocalDate.parse("2005-06-01"));
        Student s5 = new Student("钱七","S005",85, LocalDate.parse("2005-11-30"));
        StudentService studentService = new StudentService();
        studentService.addStudent(s1);
        studentService.addStudent(s2);
        studentService.addStudent(s3);
        studentService.addStudent(s4);
        studentService.addStudent(s5);
        // 步骤 2：printAll() → printSortedByScore() → 再 printAll()
        //          ↑ 观察：第二次 printAll 的顺序变了吗？验证你对"sort 改原集合"的理解
        System.out.println("-----------------------------------------------");
        studentService.printAll();
        studentService.printSortedByScore();
        System.out.println("-----------------------------------------------");
        studentService.printAll();

        // 步骤 3：try-catch 调 findById("存在的id") 和 findById("不存在的id")
        //          catch 里打印 e.getMessage()
        System.out.println("-----------------------------------------------");
        try {
            studentService.findById("S001");
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("-----------------------------------------------");
        try {
            studentService.findById("S007");
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 步骤 4：countByLevel() 拿到 Map，遍历打印每个等级的人数
        Map<String, Integer> map = studentService.countByLevel();
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        System.out.println("-----------------------------------------------");
        // 步骤 5：遍历打印"张三，20岁"这样的信息（调 calcAge）
        int year1 = studentService.calcAge(s1);
        System.out.println(s1.getName() + year1 + "岁");
        int year2 = studentService.calcAge(s2);
        System.out.println(s2.getName() + year2 + "岁");
        int year3 = studentService.calcAge(s3);
        System.out.println(s3.getName() + year3 + "岁");
        int year4 = studentService.calcAge(s4);
        System.out.println(s4.getName() + year4 + "岁");
        int year5 = studentService.calcAge(s5);
        System.out.println(s5.getName() + year5 + "岁");
    }
}
