package cn.boqi.mycollection;

/**
 * 实现链表
 * 最初版本实现添加和遍历
 */
public class BoqiLinkedList {

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
        BoqiLinkedList bq = new BoqiLinkedList();
        bq.add("a");
        bq.add("b");
        bq.add("c");
        System.out.println(bq.toString());
    }
}
