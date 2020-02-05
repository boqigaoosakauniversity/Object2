package cn.boqi;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(2000);
        System.out.println(d);

        System.out.println(d.getTime());

        Date d2 = new Date();
        System.out.println(d2.getTime());

        System.out.println(d2.after(d2));
        System.out.println(d2.after(d));

        //以后遇到日期处理，使用Calendar类（日期处理）
        Date d3 = new Date(2020-1900, 0, 16);
        System.out.println(d3);

    }
}
