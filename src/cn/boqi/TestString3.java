package cn.boqi;

public class TestString3 {
    public static void main(String[] args) {
        String a = "ada"; //String字符串是final的，是不可变的
        System.out.println(Integer.toHexString(a.hashCode()));
        a = a.substring(1,2);
        System.out.println(Integer.toHexString(a.hashCode()));
        System.out.println(a);

        //做字符串比较的时候，用equals，不要使用==
        
    }
}
