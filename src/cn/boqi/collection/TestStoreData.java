package cn.boqi.collection;

import java.util.*;

/**
 * 测试表格数据的存储
 * ORM思想的简单实验：对象，关系，映射
 * Map表示一行数据，多行数据是多个map，将多个map放入list中
 * @author QIN SIJIA
 */
public class TestStoreData {
    public static void main(String[] args) {
        Map<String, Object> row1 = new HashMap<>();

        row1.put("id", 1001);
        row1.put("name", "博奇");
        row1.put("薪水", 20000);
        row1.put("入职日期", "2005.2.2");

        Map<String, Object> row2 = new HashMap<>();

        row2.put("id", 1002);
        row2.put("name", "嘉嘉");
        row2.put("薪水", 20000);
        row2.put("入职日期", "2005.2.2");

        Map<String, Object> row3 = new HashMap<>();

        row3.put("id", 1003);
        row3.put("name", "李智");
        row3.put("薪水", 20000);
        row3.put("入职日期", "2005.2.2");

        List<Map<String, Object>> table1 = new ArrayList<>();
        table1.add(row1);
        table1.add(row2);
        table1.add(row3);
        /**
        *把table里的每一行都取出来了
         * 然后 每一行就是一个Map存了一些数据对
        */
        for(Map<String,Object> row:table1){
            /**
             * 接下来对于每一行Map的数据对做处理，用keySet先取出来所有的key
             * 然后再打印就行了
             */
            Set<String> keyset = row.keySet();
            for(String key:keyset){
                System.out.println(key+":"+row.get(key));
            }
        }


    }
}
