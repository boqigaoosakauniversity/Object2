package cn.boqi.mycollection;

import javax.management.RuntimeErrorException;
import java.lang.annotation.ElementType;

/**
 * 自定义实现一个arrayList,体会底层原理
 * 02版本增加泛型
 * 03版本增加数组扩容
 * 04版本增加set和get方法，增加数组边界的检查
 * 05版本增加remove方法,size方法和isEmpty方法
 * @author g
 */
public class BoqiArrayList05 <E> {

    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public BoqiArrayList05(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public BoqiArrayList05(int capacity){
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

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0?true:false;
    }

    public void checkIndex(int index){
        //索引合法判断：[0,size)
        if(index<0||index>=size){
            //不合法
            throw new RuntimeException("索引不合法："+"size:"+size+", 要求的index:"+ index);
        }
    }

    public void remove(E element){
        //element, 将他和所有元素挨个比较，获得第一个比较为true的返回
        for (int i=0; i<size; i++){
            if (element.equals(this.get(i))){
                //将该元素从此处移除
                remove(i);
            }
        }
    }

    public void remove(int index){
        //a,b,c,d,e,f,g,h
        //假设要删除d
        //删除完了之后：a,b,c,e,f,g,h
        //做的操作其实就是数组拷贝
        //把e,f,g,h复制到原来d开始的位置，同时把原来h的位置置为null
        int numMoved = elementData.length-index-1;
        if(numMoved>0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        this.set(null, size-1);
        size-=1;
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
        BoqiArrayList05<String> bq= new BoqiArrayList05<>(10);
        System.out.println(bq.elementData.length);
        System.out.println(bq.size);
        for (int i = 0; i<20; i++){

            bq.add("gao"+i);
        }
        bq.remove(3);
        System.out.println(bq.toString());
        bq.remove("gao13");
        System.out.println(bq.toString());
    }

}
