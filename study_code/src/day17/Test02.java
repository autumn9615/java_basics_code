package day17;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        //泛型练习
        //测试类中定义一个方法用于饲养动物
        //要求1：该方法能养所有品种的猫，但是不能养狗

        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

//        PersianCat p1 = new PersianCat("小布",2);
//        list1.add(p1);
//        keepPet(list1);
//
//        LiHuaCat l1 = new LiHuaCat("小花",3);
//        list2.add(l1);
//        keepPet(list2);



        TeddyDog t1 = new TeddyDog("小迪",4);
        list3.add(t1);
        keepPet(list3);

        HuskyDog h1 = new HuskyDog("二哈",6);
        list4.add(h1);
        keepPet(list4);

    }
    //ArrayList<? extends Cat>可以调用所有猫类
    //ArrayList<? extends Dog>可以调用所有狗类
    //ArrayList<? extends Animal>可以调用所有动物类
    public static void keepPet(ArrayList<? extends Dog> list){
        for (Dog dog : list){
            dog.eat();
        }
    }
}
