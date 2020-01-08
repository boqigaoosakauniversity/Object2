package cn.boqi;

/**
 * 测试非静态内部类
 * 非静态内部类是依托于外部对象的，因此非静态内部类里面不可以有静态的东西，因为在内存里外部对象消失里面就不可以有静态的东西
 * @author g
 */
public class TestInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        //创建内部类对象
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}

class Outer{
    private int age = 10;
    public void testOuter(){
        System.out.println("Outer.testOuter");
    }

    /**
     * 成员内部类，不加static 就是非静态内部类
     * 好处：内部类可以直接访问外部类的成员
     * 内部类通常为外部类服务
     *
     */
    class Inner{
        int age = 20;
        public void show(){
           System.out.println("外部类的成员变量age："+ Outer.this.age);
        }
    }
}
