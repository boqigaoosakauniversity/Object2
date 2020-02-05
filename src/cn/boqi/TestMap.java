package cn.boqi;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();//哈希表用的是成对的map
        m1.put(1, "bobo");
        m1.put(2,"jiajia");
        System.out.println(m1.toString());
        System.out.println(m1.get(1));
        System.out.println(m1.size());

    }
}
