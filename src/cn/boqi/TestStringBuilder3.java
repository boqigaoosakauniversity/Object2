package cn.boqi;

import org.omg.SendingContext.RunTime;

/**
 * 测试可变字符序列和不可变字符序列的常见陷阱
 * @author g
 */
public class TestStringBuilder3 {
    public static void main(String[] args) {
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();

        String str8 = "";
        for(int i= 0; i<5000; i++){//这样的代码一定不要出现
            str8 = str8 +i;//相当于产生了一万个对象
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();

        System.out.println(num1-num2);
        System.out.println(time2-time1);


        StringBuilder sb1 = new StringBuilder("");
        for (int i = 0; i< 5000; i++){
            sb1.append(i);
        }

        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();

        System.out.println(num2-num3);
        System.out.println(time3-time2);

    }
}
