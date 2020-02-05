package cn.boqi;

/**
 * 测试可变字符序列的常用方法
 * @author g
 */
public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<26; i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb);

        sb.reverse(); //倒序
        System.out.println(sb);
        sb.setCharAt(3, '高');
        System.out.println(sb);
        sb.insert(0, '我').insert(6,'爱');//链式调用。核心就是该方法调用了return this.
        System.out.println(sb);
        sb.delete(20, 23);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
