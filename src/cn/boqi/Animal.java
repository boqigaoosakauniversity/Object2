package cn.boqi;

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
