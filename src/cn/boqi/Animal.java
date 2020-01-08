package cn.boqi;

/**
 * 抽象类的意义在于，为子类提供统一的，规范的模板，子类必须实现相关的抽象方法
 */
public abstract class Animal {
    /**
     * 抽象方法的特点：
     * 1：没有实现。
     * 2：子类必须实现
     */
    abstract public void shout();
}

class Dog extends Animal{
    @Override
    public void shout(){
        System.out.println("daf");
    }
}
