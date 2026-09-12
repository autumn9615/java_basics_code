package day13;

import java.time.ZoneId;
import java.util.Set;

public class timeZone {
    public static void main(String[] args) {
        //时区练习
        //获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);
        //获取当前默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        //获取指定时区
        ZoneId zoneId1 = ZoneId.of("US/Mountain");
        System.out.println(zoneId1);
    }
}
