package cn.boqi;

import java.text.DateFormat;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的相互转换
 * DateFormat抽象类和SimpleDateFormat实现类的使用
 * @author g
 */
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {

        //把时间按照“格式字符串指定的格式”转成相应的字符串
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String str = df.format(new Date(1100074000));
        System.out.println(str);

        //把字符串按照”格式字符串指定的格式”转成相应的事件对象
        DateFormat df2  = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");

        Date data = df2.parse("1983年5月10日 10时45分59秒");
        System.out.println(data);

        //测试其他的格式字符
        DateFormat df3 = new SimpleDateFormat("h");
        String str3 = df3.format(new Date());
        System.out.println(str3);
    }
}
