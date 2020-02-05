package cn.boqi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期类的使用
 * @author g
 */
public class TestCalendar {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2999, 10,8,22,10,50);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);//0一月。。。11十二月
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);//1表示星期日，2星期一。。。7星期六

        System.out.println(weekDay +","+year);

        //设置日期
        Calendar c2 = new GregorianCalendar();
        c2.set(Calendar.YEAR, 8012);
        System.out.println(c2);

        //日期的计算
        Calendar c3 = new GregorianCalendar();
        c3.add(Calendar.DATE, 100);
        System.out.println(c3);

        //日期对象和时间对象的转化
        Date d4 = c3.getTime();
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());
        printCalendar(c4);
    }

    public static void printCalendar(Calendar c){
        //打印：1918年10月10日 11:23分45秒 周3
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int dayWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        String dayWeek2 = dayWeek ==0?"日":dayWeek+"";

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+ day+"ri  " +hour+"hour"+minute+"minute"+second+"second "+"zhou"+dayWeek2);
    }
}
