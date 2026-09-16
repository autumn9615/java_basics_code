package day24;

public class GirlFriend {
    // 女朋友Java been类，测试用
    String name;
    int age;
    public GirlFriend() {}
    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    // 姓名的长度在3-10之间
    public void setName(String name) {
        if(name.length()<3 || name.length()>10){
            throw new NameFormatException(name + "的长度在3-10之间");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    // 年龄的范围为18-40岁
    public void setAge(int age) {
        if(age<18 || age>40){
            throw new AgeOutOfBoundsException(age + "的范围为18-40岁");
        }
        this.age = age;
    }
    @Override
    public String toString() {
        return "名字:" + this.getName() + " 年龄:" +  this.getAge();
    }
}
