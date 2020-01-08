package cn.boqi;

public class TestStaticInnerClass {
    public static void main(String[] args) {
        Outer2.Inner2 inner2 = new Outer2.Inner2();
    }
}

class Outer2{

    static class Inner2{

    }
}
