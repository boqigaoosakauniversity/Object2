package cn.boqi.mycollection;

import javax.management.RuntimeErrorException;
import java.lang.annotation.ElementType;

/**
 * 自定义实现一个arrayList,体会底层原理
 * 02版本增加泛型
 * 03版本增加数组扩容
 * 04版本增加set和get方法，增加数组边界的检查
 * @author g
 */
public class BoqiArrayList04 <E> {

    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public BoqiArrayList04(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public BoqiArrayList04(int capacity){
        if(capacity<0) {
            throw new RuntimeException("容器的容量不能为负数");
        }else if(capacity == 0){
            elementData = new Object[DEFAULT_CAPACITY];
        }

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

    public E get(int index){
        checkIndex(index);
        return (E) elementData[index];
    }

    public void set(E element, int index){
        checkIndex(index);
        elementData[index] = element;
    }

    public void checkIndex(int index){
        //索引合法判断：[0,size)
        if(index<0||index>=size){
            //不合法
            throw new RuntimeException("索引不合法："+"size:"+size+", 要求的index:"+ index);
        }
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
        BoqiArrayList04<String> bq= new BoqiArrayList04<>(10);
        for (int i = 0; i<20; i++){

            bq.add("gao"+i);
        }
        bq.set("GAP",50);
        System.out.println(bq.toString());
    }

}
