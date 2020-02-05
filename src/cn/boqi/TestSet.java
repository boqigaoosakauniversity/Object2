package cn.boqi;

import java.util.HashSet;
import java.util.Set;

/**
 * Set其实就是集合
 * 集合就是不能有重复元素
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("fda");
        set.add("dafda");
        set.add("fda");
        System.out.println(set.toString());
    }
}
