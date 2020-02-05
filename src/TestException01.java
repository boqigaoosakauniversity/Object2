import java.util.Calendar;

public class TestException01 {
    public static void main(String[] args) {
        String str = null;

        if(str!=null) str.length();//空指针异常，对象为空但是调用了其方法

        Animal d = new Dog();
        if (d instanceof Cat){
            Cat c = (Cat)d;
        }


    }
}

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}