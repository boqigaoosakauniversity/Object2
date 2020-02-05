package cn.boqi.mycollection;

/**
 * 实现链表
 * 最初版本实现添加和遍历
 * 02版本实现get
 */
public class BoqiLinkedList02 {

    private Node first;
    private Node last;
    private int size;

    //[]
    //["a"]
    //["a","b","c"]
    public void add(Object obj){
        Node node = new Node(obj);

        if (first==null){
            //如果向一个空链表插入节点
            node.previous = null;
            node.next = null;
            first = node;
            last = node;
        }else {
            //如果是向非空链表在最后插入【c】
            node.previous = last;//【c】的previous先指向b
            node.next = null;//【c】的next为空
            last.next = node;//b的next也指向C
            last = node;//把C设置为last节点
        }
        size++;
    }

    //["a","b","c","d"] 比如要取c，然后传进来的数字那就是2
    public Object get(int index){
        Node temp = first;

        if (index<0||index>size-1){
            throw new RuntimeException("索引位置不合法");
        }else if (index<=(size>>1)){
            for (int i=0; i<index; i++){
                temp = temp.next;
            }
        }else {
            temp = last;
            for (int i=size-1; i>index; i--){//最大的索引就是size-1
                temp = temp.previous;
            }
        }
            return temp.element;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //[a,b,c] first = a, last = c
        //a,b,c
        Node temp = first;
        while (temp!=null){
            sb.append(temp.element+",");
            temp= temp.next;
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }


    public static void main(String[] args) {
        BoqiLinkedList02 bq = new BoqiLinkedList02();
        bq.add("a");
        bq.add("b");
        bq.add("c");
        bq.add("d");
        bq.add("e");
        bq.add("f");
        bq.add("g");
        bq.add("h");
        bq.add("i");
        System.out.println(bq.get(6));
    }
}
