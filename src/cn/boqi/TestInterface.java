package cn.boqi;

public class TestInterface {
    public static void main(String[] args) {
        Volant v = new Angle();

        Honest h = new GoodMan();
        h.helpOther();

    }
}

/**
 * 飞行接口
 * @author g
 */
interface Volant{
    int FLY_HEIGHT = 1000;
    void fly();
}

interface Honest{
    void helpOther();
}

class Angle implements Volant, Honest{//子类可以实现多个父接口

    @Override
    public void fly(){}

    @Override
    public void helpOther(){}
}

class GoodMan implements Honest{

    @Override
    public void helpOther(){}
}

class BirdMan implements Volant{

    @Override
    public void fly(){}
}