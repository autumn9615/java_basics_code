package day26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest02 {
    public static void main(String[] args) throws IOException {
        // 练习一：使用异或运算进行文件加密和解密
        // 注意：同两个字节被同一个数字异或两次会回到原来的样子（原理）
        FileInputStream fis = new FileInputStream("D:\\Workspace\\Java\\basics_code\\study_code\\src\\day26\\Snipaste_2026-06-16_19-09-59.png");
        FileOutputStream fos = new FileOutputStream("D:\\Workspace\\Java\\basics_code\\study_code\\src\\day26\\加密图.png");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 2);
        }
        //4.释放资源
        fos.close();
        fis.close();
    }
}
