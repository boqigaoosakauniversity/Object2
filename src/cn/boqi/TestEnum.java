package cn.boqi;

import java.util.Random;

public class TestEnum {
    public static void main(String[] args) {
        //枚举的便利
        for(Week k: Week.values()){
            System.out.println(k);
        }

        //Switch语句中使用枚举
        int a = new Random().nextInt(4);
        switch (Season.values()[a]){
            case SPRING:
                System.out.println("Chuntian");
                break;
            case AUTUMN:
                System.out.println("qiutian");
            case SUMMER:
                System.out.println("xiatian");
            case WINTER:
                System.out.println("dongtian");
        }
    }
    enum Season{
        SPRING, SUMMER, AUTUMN, WINTER
    }

    enum Week{
        星期一,星期二,星期三,星期四,星期五,星期六,星期天
    }
}
