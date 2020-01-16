package cn.boqi;

public class TestString2 {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = " How are you? ";

        System.out.println(s2.startsWith("How"));
        System.out.println(s2.endsWith("you"));
        System.out.println(s2.toLowerCase());
        System.out.println(s2.substring(50));
        System.out.println(s2.trim());
    }
}
