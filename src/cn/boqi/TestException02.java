package cn.boqi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException02 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader =  new FileReader("gg.txt");
            char c1 = 0;
            c1 = (char)reader.read();
            System.out.println(c1);
        } catch (FileNotFoundException e) {//子类异常必须在父类异常前面
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
