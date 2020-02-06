package cn.boqi.collection;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * 辅助类Collections的测试
 * @author QIN SIJIA
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        for(int i = 0; i<10 ;i++){
            list.add(""+i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(Collections.binarySearch(list,"2"));
    }
}
