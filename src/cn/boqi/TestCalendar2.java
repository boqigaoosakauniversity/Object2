package cn.boqi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历程序
 * @author QIN SIJIA
 */
public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {
        String str = "2020-02-25";

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date date = df.parse(str);
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        c.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int j = 0; j<7-c.getMinimalDaysInFirstWeek();j++){
            System.out.print("\t");
        }
        int maxDate = c.getActualMaximum(Calendar.DATE);//取得当月最大天数s
        for(int i = 1; i<=maxDate; i++){
            System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println(); //if Saturday, new line
            }
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
