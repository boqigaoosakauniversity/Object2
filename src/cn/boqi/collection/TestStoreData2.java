package cn.boqi.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试表格数据的存储
 * 体会ORM思想
 * 每一行数据使用javabean对象存储，多行使用放到map或者list中
 * @author QIN SIJIA
 */
public class TestStoreData2 {
    public static void main(String[] args) {
        User user1 = new User(1001, "张三", 3000,"2018.5.5");
        User user2 = new User(1002, "李四", 3000,"2018.5.5");
        User user3 = new User(1003, "王五", 3000,"2018.5.5");
        List<User> u = new ArrayList<>();
        u.add(user1);
        u.add(user2);
        u.add(user3);

        for (User temp:u){
            System.out.println(temp.toString());
        }
    }
}

class User{
    private int id;
    private String name;
    private double salary;
    private String hireDate;

    /**
     * 一个完整的javabean要有set和get方法
     * 还有一个空的无参构造器
     */
    public User(){

    }

    public User(int id, String name, double salary, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString(){
        return "id"+id+",name"+name+",salary"+salary+",hire date"+hireDate;
    }
}
