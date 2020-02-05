package cn.boqi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author QIN SIJIA
 */
public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {

        System.out.println("Please Enter date");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date date = df.parse(str);
        Calendar c = new GregorianCalendar();

        c.setTime(date);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int maxDate = c.getActualMaximum(Calendar.DATE);//取得当月最大天数s

        c.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int j = 0; j<c.get(Calendar.DAY_OF_WEEK)-1;j++){
            System.out.print("\t");
        }

        //天数s
        for(int i = 1; i<=maxDate; i++){
            if(day == c.get(Calendar.DAY_OF_MONTH)){
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*\t");
            }else {
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
            }

            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println(); //if Saturday, new line
            }
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
