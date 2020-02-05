package cn.boqi.mycollection;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(300);
        set.add(400);
        set.add(512);
        set.add(1);

        System.out.println(set.toString());

    }
}
