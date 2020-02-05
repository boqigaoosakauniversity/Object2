import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试Collection接口中的方法
 * @author QIN SIJIA
 */
public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();

        c.size();
        c.isEmpty();
        c.add("博奇");
        c.add("boqi");
        System.out.println(c);
    }
}
