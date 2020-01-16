package cn.boqi;

/**
 * 测试StringBuilder，StringBuffer
 * @author g
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        //StringBuilder是可变的字符序列

        String str;

        //StringBuilder线程不安全，效率高（一般使用这个，因为一般不在乎线程安全）
        StringBuilder str1 = new StringBuilder("fdafdafda");
        //StringBuffer线程安全，效率低

        System.out.println(Integer.toHexString(str1.hashCode()));
        System.out.println(str1);

        str1.setCharAt(2, 'y');

        System.out.println(Integer.toHexString(str1.hashCode()));//地址没有变，是同一个对象，
        System.out.println(str1);//值变了，所以是可变字符序列，和String不同
    }
}
