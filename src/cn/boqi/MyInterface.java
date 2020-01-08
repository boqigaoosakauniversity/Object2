package cn.boqi;

public interface MyInterface {
    int MAX_AGE = 100;
    void test01();
}

class MyClass implements MyInterface{

    @Override
    public void test01(){
        System.out.println(MAX_AGE);
        return;
    }
}