package day26;

import java.io.*;

public class ByteStreamTest01 {
    public static void main(String[] args) throws IOException {
        // 练习一：拷贝文件夹
        /*
         * 拷贝文件夹
         * 参数一：数据源
         * 参数二：目的地
         * */

        // 创建对象表示从哪里拷贝
        File from = new File("D:\\Workspace\\Java\\basics_code\\study_code\\src\\day26\\from");
        // 创建对象表示拷贝目的地
        File dest = new  File("D:\\Workspace\\Java\\basics_code\\study_code\\src\\day26\\dest");
        // 调用方法开始拷贝
        copydir(from,dest);
    }

    private static void copydir(File from, File dest) throws IOException {
        dest.mkdirs();
        // 1.进入数据源
        File[] files = from.listFiles();
        // 2.遍历数组
        for (File file : files) {
            if(file.isFile()){
                // 3.判断是文件，拷贝
                FileInputStream  fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] b = new byte[1024];
                int len;
                while((len = fis.read(b)) != -1){
                    fos.write(b,0,len);
                }
                fos.close();
                fis.close();
            }else{
                // 4.判断是文件夹，递归
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
