package cn.boqi.mycollection;

import java.lang.annotation.ElementType;

/**
 * 自定义实现一个arrayList,体会底层原理
 * 02版本增加泛型
 * 03版本增加数组扩容
 * @author g
 */
public class BoqiArrayList03 <E> {

    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public BoqiArrayList03(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public BoqiArrayList03(int capacity){
        elementData = new Object[capacity];
    }

    public void add(E element){
        //什么时候扩容？
        if(size == elementData.length){
        //扩容操作
        Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
        System.arraycopy(elementData, 0, newArray,0, elementData.length);
        elementData = newArray;
        }

        elementData[size++] = element;
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
        BoqiArrayList03<String> bq = new BoqiArrayList03<>(5);
        for (int i = 0; i<10; i++){
            bq.add("bobo");
        }
        System.out.println(bq.toString());
    }

}
