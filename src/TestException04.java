
public class TestException04 {

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-90);
    }
}

class Person{
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}

class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(){

    }

    public IllegalAgeException(String msg){
        super(msg);
    }
}