package cn.boqi;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> tm= new TreeMap<>();
        tm.put(20,"aa");
        tm.put(3,"bb");
        tm.put(6,"cc");

        //按照k递增的方式进行了排序

        for(Integer key:tm.keySet()){
            System.out.println(key+"---"+tm.get(key));
        }

        Map<Emp, String > tm2 = new TreeMap<>();
        Emp emp1 = new Emp(304, "boqi1", 51);
        tm2.put(emp1, "testemp");
        tm2.put(new Emp(104,"jiajia", 10053), "jijiagood");
        tm2.put(new Emp(105,"jiajia1", 103140), "jiajiagood");
        tm2.put(new Emp(100,"bobo", 10010), "bobogood");

        String k= tm2.get(emp1);
        System.out.println(k);
        //for (Emp key:tm2.keySet()){
         //   System.out.println(key.id+"---"+tm2.get(key));
        //}
    }
}

class Emp implements Comparable <Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp emp) { //负数：小于，0：等于， 正数：大于
        if (this.salary >emp.salary){
            return 1;
        }else if (this.salary<emp.salary){
            return  -1;
        }else {
            if(this.id>emp.id){
                return 1;
            }else if(this.id<emp.id){
                return -1;
            }else {
                return 0;
            }
        }
    }
}