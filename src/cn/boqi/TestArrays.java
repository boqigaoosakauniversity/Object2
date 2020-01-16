package cn.boqi;

import java.util.Arrays;

/**
 * 测试arrays工具类的使用
 * @author g
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] a = {10,20,30,510,431241,53124,305};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.binarySearch(a, 32);
        System.out.println(Arrays.binarySearch(a, 32));
    }
}
