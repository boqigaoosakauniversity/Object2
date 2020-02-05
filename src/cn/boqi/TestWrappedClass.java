package cn.boqi;

import java.util.LinkedList;

/**
 * 测试包装类
 * @author g
 */
public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转换成包装类对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(3);

        //把包装类对象转换成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        //把字符串转成包装类对象
        Integer e = new Integer("9999");
        Integer f = Integer.parseInt("84321");

        //把包装类对象转成字符串
        f.toString();

        LinkedList bq = new LinkedList();
    }
}
