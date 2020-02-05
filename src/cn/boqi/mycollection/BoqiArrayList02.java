package cn.boqi.mycollection;

import java.lang.annotation.ElementType;

/**
 * 自定义实现一个arrayList,体会底层原理
 * 02版本增加泛型
 * @author g
 */
public class BoqiArrayList02 <E> {

    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public BoqiArrayList02(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public BoqiArrayList02(int capacity){
        elementData = new Object[capacity];
    }

    public void add(E element){
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

    }

}
