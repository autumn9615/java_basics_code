package day30;

import java.time.LocalDate;
import java.util.*;

public class StudentService{
    // 创建ArrayList结合来当数据库存学生信息
    // 定义成员变量是因为所有的都要操作他
    private ArrayList<Student> students = new ArrayList<>();
    // 创建方法，用于添加学生
    public void addStudent(Student s){
         students.add(s);
    }
    /*
    * 创建方法打印所有学生（每行一个）
    * */
    public void  printAll(){
        System.out.println("所有学生为：");
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
    /*
    * 然后按成绩从高到低排序后重新打印
    * - 要求用 Comparator + Lambda（不许让 Student 实现 Comparable）
    * */
    public void printSortedByScore(){
        students.sort(Comparator.comparing(Student::getScore).reversed());
    }
    /*
    * 按学号查找学生并打印其信息
    * 学号不存在时：抛出你自定义的 StudentNotFoundException
    * 在 main 里 try-catch 捕获，打印友好提示
    * */
    public void findById(String id) throws StudentNotFoundException{
        for (Student s : students) {
            if(s.getId().equals(id)){
                System.out.println(s.toString());
            }
        }
    }
    /*
     * 统计各分数段人数并打印：
     * 优秀(>=90) / 良好(80-89) / 中等(60-79) / 不及格(<60)
     * 必须用 Map<String, Integer> 完成（key=等级，value=人数）
     * */
    public Map<String,Integer> countByLevel(){
        // 优秀的人数
        int valueA = 0;
        // 良好的人数
        int valueB = 0;
        // 中等的人数
        int valueC = 0;
        // 不及格的人数
        int valueD = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getScore() >= 90){
                valueA++;
                map.put("优秀",valueA);
            }else if(students.get(i).getScore() >= 80 && students.get(i).getScore() <= 89){
                valueB++;
                map.put("良好",valueB);
            }else if(students.get(i).getScore() >= 60 && students.get(i).getScore() <= 79){
                valueC++;
                map.put("中等",valueC);
            }else if(students.get(i).getScore() < 60){
                valueD++;
                map.put("不及格",valueD);
            }
        }
        return map;
    }
    /*
    *  输入/预置学生的生日（LocalDate）
    *  计算并打印每个学生的年龄（按周岁）
    *  - 必须用 java.time 包（LocalDate / Period / ChronoUnit 任选）
    *  - 不许用 Date / SimpleDateFormat
    *  */
    public int calcAge(Student s){
        if((LocalDate.parse(s.getBirthday()).getYear() % 400 == 0)
        || (LocalDate.parse(s.getBirthday()).getYear() % 4 == 0 && LocalDate.parse(s.getBirthday()).getYear() % 100 != 0)){
            if(LocalDate.parse(s.getBirthday()).getDayOfYear() - 1 > LocalDate.now().getDayOfYear()){
                return LocalDate.now().getYear() - LocalDate.parse(s.getBirthday()).getYear() - 1;
            }else{
                return LocalDate.now().getYear() - LocalDate.parse(s.getBirthday()).getYear();
            }
        }else{
            if(LocalDate.parse(s.getBirthday()).getDayOfYear() > LocalDate.now().getDayOfYear()){
                return LocalDate.now().getYear() - LocalDate.parse(s.getBirthday()).getYear() - 1;
            }else{
                return LocalDate.now().getYear() - LocalDate.parse(s.getBirthday()).getYear();
            }
        }
    }
}
