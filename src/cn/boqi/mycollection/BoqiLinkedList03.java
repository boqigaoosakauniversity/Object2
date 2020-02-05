package cn.boqi.mycollection;

/**
 * 实现链表
 * 最初版本实现添加和遍历
 * 02版本实现get
 * 03版本实现remove和add和泛型
 * @author g
 */
public class BoqiLinkedList03 <E> {

    private Node first;
    private Node last;
    private int size;

    //[]
    //["a"]
    //["a","b","c"]
    public void add(E e){
        Node node = new Node(e);

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
        checkRange(index);
        Node temp = getNode(index);
        return temp!=null?temp.element:null;
    }

    private Node getNode(int index){

        checkRange(index);
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
        return temp;
    }

    private void checkRange(int index){
        if (index<0||index>size-1) {
            throw new RuntimeException("索引位置不合法");
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

    public void remove(int index){

        checkRange(index);
        Node temp = getNode(index);
        Node up = temp.previous;
        Node down = temp.next;

        if(up!=null){
            up.next = down;
        }

        if (down!=null){
            down.previous = up;
        }
        //被删除的元素是第一个元素时候
        if (index == 0){
            first = down;
        }
        //被删除的元素是最后一个元素的时候
        if (index == size -1){
             last = up;
        }

        size -= 1;
    }

    public void add(int index, E e){
        Node newNode = new Node(e);
        //相当于要把newnode插在temp前面，这样newnode的index自然就是所要的index
        Node temp = getNode(index);

        if(temp!=null){

            Node up = temp.previous;
            //连接前一个
            up.next = newNode;
            newNode.previous = up;
            //连接后一个
            newNode.next = temp;
            temp.previous = newNode;
        }
    }


    public static void main(String[] args) {
        BoqiLinkedList03<String> bq = new BoqiLinkedList03<>();
        bq.add("a");
        bq.add("b");
        bq.add("c");
        bq.add("d");
        bq.add("e");
        bq.add("f");
        bq.add("g");
        bq.add("h");
        bq.add("i");
        bq.add(3,"老高");
        System.out.println(bq.toString());
    }
}
