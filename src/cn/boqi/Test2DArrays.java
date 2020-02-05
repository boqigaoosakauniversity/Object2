package cn.boqi;
/**
 * 测试二维数组
 * @author g
 */
public class Test2DArrays {

    public static void main(String[] args) {
        //int[] a = new int[3];

        //Car[] cars  = new Car[3];
        int[][] a = new int[3][];
        a[0] = new int[]{20,30};
        a[1] = new int[]{421,3213,421};
        a[2] = new int[]{421, 021};

        System.out.println(a[2][0]);
    }

}

class Car{

}