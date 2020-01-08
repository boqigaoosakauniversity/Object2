package cn.boqi;

public class TestString {
    public static void main(String[] args) {
        String a = new String();
        a = "abc";
        System.out.println(a);

        String str10 = "boqi";
        String str11 = "boqi";
        String b = new String("boqi");

        System.out.println(str10.equals(b));
    }
}
