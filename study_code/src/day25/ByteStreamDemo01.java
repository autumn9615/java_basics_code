package day25;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        // 字节流演示：

        // void write(int b)                       一次写一个字节数据
        // void write(byte[] b)                    一次写一个字节数组数据
        // void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据

        // 1.创建对象
        FileOutputStream fos = new FileOutputStream("D:\\Workspace\\Java\\basics_code\\study_code\\src\\day25\\test.txt");
        // 2.写出数据
        fos.write(97);// a
        fos.write(98);// b

        byte[] bytes = {97,98,99,100,101};

        // 数组写入
        fos.write(bytes);

        // 数组部分写入
        fos.write(bytes,1,3);



        // 3.释放资源
        fos.close();
    }
}
