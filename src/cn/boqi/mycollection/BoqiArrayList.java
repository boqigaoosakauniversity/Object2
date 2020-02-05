package cn.boqi.mycollection;

import java.lang.annotation.ElementType;

/**
 * 自定义实现一个arrayList,体会底层原理
 * @author g
 */
public class BoqiArrayList {

    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public BoqiArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public BoqiArrayList(int capacity){
        elementData = new Object[capacity];
    }

    public void add(Object obj){
        elementData[size++] = obj;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        //[a,b,c]
        sb.append("[");
        for (int i = 0; i<size; i++){
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length()-1,']');

        return sb.toString();

    }



    public static void main(String[] args) {
        BoqiArrayList s1 = new BoqiArrayList();
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1.toString());
    }

}
