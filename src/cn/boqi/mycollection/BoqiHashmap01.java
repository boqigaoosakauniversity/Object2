package cn.boqi.mycollection;

/**
 * 自定义一个hashmap
 * 01定义一些基本结构，然后定义储存对,完善put方法
 * 02版本增加toSting
 * 03版本增加get，查找键值对
 * @author QIN SIJIA
 */
public class BoqiHashmap01 <K, V> {

    NodeHashMap[] table;//位桶数组，bucket array
    int size;

    public BoqiHashmap01(){
        table = new NodeHashMap[16];//长度一般定义成2的整数次幂
    }

    public V get(K key){
        int hash = myHash(key.hashCode(), table.length);
        V value = null;

        if (table[hash]!=null){
            NodeHashMap<K,V> temp = table[hash];

            while (temp!=null){
                if (temp.key.equals(key)) {
                    value = temp.value;
                    break;
                }//如果相等，则返回对应的value
                else {
                    temp = temp.next;
                }
            }

        }

        return value;
    }

    /**
     * 把新的数据对放进哈希表
     * @param key 键值
     * @param value 数据值
     */
    public void put(K key, V value){



        //如果要完善，还需要考虑数组扩容的问题！！

        //定义一个新的节点对象
        NodeHashMap<K,V> newNode = new NodeHashMap();
        newNode.hash = myHash(key.hashCode(), table.length);//先计算key的哈希值，然后取模
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        NodeHashMap<K,V> temp = table[newNode.hash];

        NodeHashMap<K,V> iterLast = null;//链表中已有的最后一个元素

        boolean keyRepeat = false;
        if(temp == null){
            //如果哈希值所在的数组元素为空，则直接将新节点放进去
            table[newNode.hash] = newNode;
        }else {
            /**
             * 如果此处元素不为空，那么遍历相对应链表
             * 1.如果键相同的就替换掉
             * 2.如果没有见
             */
            while(temp!=null){

                //判断key是否重复，如果重复，则覆盖
                if(temp.key.equals(key)){
                    keyRepeat = true;
                    System.out.println("key重复了！");
                    temp.value = value;//只是覆盖value即可，其他的值保持不变

                    break;//覆盖了以后把循环结束就好了

                }else {

                    //key如果不重复,key需要继续遍历到下一个直到找到
                    iterLast = temp;
                    temp = temp.next;

                }
            }

            if (!keyRepeat){//没有发生key重复的情况，则添加到链表最后
                iterLast.next = newNode;
            }
        }
        size += 1;
    }

    /**
     * 自己的哈希方法 (注意哈希值hash 和 hashCode不是一个东西）
     * @param v：value
     * @param length：位桶数组的长度
     * @return 哈希值
     */
    public int myHash(int v, int length){
        System.out.println("hash in myHash:" + (v&(length-1)));
        return v&(length-1);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{");

        for(int i = 0; i < table.length; i++){
            NodeHashMap temp = table[i];
            while (temp!=null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length()-1, '}');

        return sb.toString();
    }

    public static void main(String[] args) {
        BoqiHashmap01<Integer, String> m = new BoqiHashmap01<>();
        m.put(421,"aa1");
        m.put(43,"aa2");
        m.put(1,"aa3");
        m.put(17, "aa4");
        m.put(17,"aaa7");
        System.out.println(m.get(43));

        System.out.println(m.toString());
    }

}
