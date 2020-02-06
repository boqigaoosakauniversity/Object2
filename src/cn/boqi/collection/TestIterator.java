package cn.boqi.collection;

import java.util.*;

/**
 * 测试迭代器遍历List，Set，Map
 * @author QIN SIJIA
 */

public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testIteratorMap();
        testIteratorMap2();
    }

    public static void testIteratorList(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        for(Iterator<String> iter = list.iterator(); iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorSet(){
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        for(Iterator<String> iter = set.iterator(); iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    //第一种遍历map方式
    public static void testIteratorMap(){
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"a");
        mp.put(2,"a");
        mp.put(3,"a");
        Set<Map.Entry<Integer, String>> ss = mp.entrySet();

        for(Iterator<Map.Entry<Integer, String>> iter = ss.iterator();iter.hasNext();){
            Map.Entry<Integer, String> temp = iter.next();
            System.out.println(temp.getKey()+"----"+temp.getValue());
        }
    }

    //第二种遍历map方式
    public static void testIteratorMap2(){
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"a");
        mp.put(2,"b");
        mp.put(3,"c");

        Set<Integer> keySet = mp.keySet();

        for(Iterator<Integer> iter = keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key+"----"+mp.get(key));
        }
    }

}
