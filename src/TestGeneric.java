import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("boqi", 1);

        System.out.println(mc.get(1));

        List list = new ArrayList();
        Map map = new HashMap();
    }
}

class MyCollection<E>{

    Object[] objs = new Object[5];

    public void set(E e, int index){
        objs[index] = e;
    }

    public E get(int index){
        return (E) objs[index];
    }
}