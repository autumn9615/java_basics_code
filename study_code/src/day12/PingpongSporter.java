package day12;

public class PingpongSporter extends Sporter implements Engilsh{
    //乒乓球运动员
    public PingpongSporter(){

    }
    public PingpongSporter(String name,int age){
        super(name,age);
    }
    @Override
    public void spaekEnglish() {
        System.out.println(this.getName() + "运动员学说英语");
    }
    @Override
    public void sport(){
        System.out.println(this.getName() + "运动员学打乒乓球");
    }
}
