package cn.boqi;

import java.util.Arrays;

/**
 * 测试自动装箱和自动拆箱
 * @author g
 */
public class TestAutoBox {
    public static void main(String[] args) {
        //缓存[-128, 127]之间的数字，实际就是系统初始时候，创建了[-128, 127]之间的一个缓存数组
        //当我们调用valueOf（）的时候，首先检查是否在【-128,127】之间，如果这个范围则直接从缓存数组中拿出已经建好的对象
        //如果不在这个范围，则创建新的Integer对象
        Integer in3 = -4;
        Integer in4 = -4;
        System.out.println(in3 == in4);
        System.out.println(in3.equals(in4));



    }
}
