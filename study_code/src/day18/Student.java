package day18;

public class Student implements Comparable<Student>{
    //创建学生类
    //里面存姓名，年龄，语文成绩，数学成绩，英语成绩（名字按照字符串）

    String name;
    int age;
    int Chinese;
    int Math;
    int English;

    //生成Java been类
    public Student(){}

    public Student(String name,int age,int Chinese,int Math,int English){
        this.name=name;
        this.age=age;
        this.Chinese=Chinese;
        this.Math=Math;
        this.English=English;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getChinese(){
        return Chinese;
    }
    public void setChinese(int Chinese){
        this.Chinese=Chinese;
    }
    public int getMath(){
        return Math;
    }
    public void setMath(int Math){
        this.Math=Math;
    }
    public int getEnglish(){
        return English;
    }
    public void setEnglish(int English){
        this.English=English;
    }

    //重写toString方法
    @Override
    public String toString(){
        return ("姓名：" + this.getName() + ", 年龄：" + this.getAge() + ", 语文成绩：" +
                this.getChinese() + ", 数学成绩：" + this.getMath() + ", 英语成绩：" +
                this.getEnglish() + "总分为：" + (this.getChinese() +  this.getMath() + this.getEnglish()));
    }

    //重写接口Comparable的方法
    //这样排出来默认的是从小到大的顺序（从大到小的话就用o - this）
    @Override
    public int compareTo(Student o) {
        int sum1 = this.getChinese() +  this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() +  o.getMath() + o.getEnglish();

        //比较总分
        int i = sum1 - sum2;
        //如果总分一样，按照语文成绩排
        i = ((i == 0) ? this.getChinese() - o.getChinese() : i);
        //如果语文一样，按照数学成绩排
        i = ((i == 0) ? this.getMath() - o.getMath() : i);
        //如果数学一样，按照英语成绩排
        i = ((i == 0) ? this.getEnglish() - o.getEnglish() : i);
        //如果英语一样，按照年龄排
        i = ((i == 0) ? this.getAge() - o.getAge() : i);
        //如果年龄一样，按照姓名的字母顺序排（字符串比较）
        i = ((i == 0) ? this.getName().compareTo(o.getName()) : i);
        //如果都一样，认为是同一个学生，不存储
        return i;
    }
}
