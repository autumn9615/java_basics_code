package day23;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionTest01 {
    public static void main(String[] args) {
        // 引用静态方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");
        list.stream()
                .map(Integer::parseInt)
                .forEach(s->System.out.print(s + " "));
    }
}
