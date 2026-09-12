package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class flashSale {
    public static void main(String[] args) throws ParseException {
        //秒杀活动练习
        //定义字符表示三个时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = "2023年11月11日 0:11:0";
        //解析三个时间得到date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endtDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);
        //得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endtDate.getTime();
        long orderTime = orderDate.getTime();
        //判断
        if(orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参加秒杀活动成功！");
        }else{
            System.out.println("参加秒杀活动失败！");
        }
    }
}
