package cn.boqi;

public class TestArrayCopy {
    public static void main(String[] args) {
        String[] s1 = {"aa", "bb","cc","dd","ee"};
        s1 = insertItem(s1, "ii", 2);
        for(int i = 0; i<s1.length; i++) {
            System.out.println(i + "--" + s1[i]);
        }
        }


    public static void testBasicCopy(){
        String[] s1 = {"aa", "bb","cc","dd","ee"};
        String[] s2 = new String[10];

        System.arraycopy(s1, 2, s2, 3, 3);
        for(int i = 0; i<s2.length; i++) {
            System.out.println(i + "--" + s2[i]);
        }
    }

    public static String[] testBasicCopy2(String[] s, int index){
        System.arraycopy(s, index+1, s, index, s.length-index-1);
        s[s.length-1] = null;
        return s;
    }

    //数组的扩容本质上是先定一个一个更大的数组，然后将原数组内容原封不动拷贝到新数组中
    public static String[] extendRange(String[] s){
        String[] s2 = new String[s.length + 10];
        System.arraycopy(s, 0, s2, 0, s.length); //将s1中所有的元素拷贝到s2
        return s2;
    }

    public static String[] insertItem(String[] s, String a, int index){
        String[] s2 = extendRange(s);
        System.arraycopy(s, index, s2, index+1, s.length-index);
        s2[index] = a;
        return s2;
    }


}
