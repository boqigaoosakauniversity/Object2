package cn.boqi;

import java.io.File;

public class TestRecursion {
    public static void main(String[] args) {
        File f = new File("D:\\Programs\\sougou\\SogouInput\\9.5.0.3517");
        printFile(f, 0);
    }

    static void printFile(File file, int level){

        //输出层数
        for (int i = 0; i<level; i++){
            System.out.print("-");
        }

        System.out.println(file.getName());
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File temp:files){
                printFile(temp, level+1);
            }
        }
    }
}
