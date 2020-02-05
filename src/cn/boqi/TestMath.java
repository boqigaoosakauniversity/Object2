package cn.boqi;

import java.util.Random;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(2.3));
        System.out.println(Math.round(2.5));
        Random rand = new Random();
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextInt(10));
    }
}
