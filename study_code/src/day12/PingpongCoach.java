package day12;

public class PingpongCoach extends Coach implements Engilsh{
    //乒乓球教练
    public PingpongCoach(){

    }
    public PingpongCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void spaekEnglish() {
        System.out.println(this.getName() + "教练学说英语");
    }
    @Override
    public void teach(){
        System.out.println(this.getName() + "教练教学员打乒乓球");
    }
}
