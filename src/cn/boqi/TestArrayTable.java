package cn.boqi;

import java.util.Arrays;

/**
 * 测试数组存储表格数据
 * @author g
 */
public class TestArrayTable {
    public static void main(String[] args) {
        Object[] emp1={1001, "boqi", 18, "stu","199208"};
        Object[] emp2={1002, "boqi2", 15, "tea","199202"};
        Object[] emp3={1003, "boqi3", 12, "ser","199204"};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for (Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }
    }
}
