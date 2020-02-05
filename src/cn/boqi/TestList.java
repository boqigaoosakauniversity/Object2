package cn.boqi;

import java.util.*;

/**
 *
 * @author g
 */
public class TestList {
    public static void main(String[] args) {
        test03();

    }

    public static void test03(){
        List<String> list = new ArrayList<>(20);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(null);
        System.out.println(list.size());
        System.out.println(list);

        list.add(0, "ADD");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.set(0, "SET");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.indexOf("B"));
    }
    public static void test04(){
        ArrayList<String> list = new ArrayList<>();


    }

}
