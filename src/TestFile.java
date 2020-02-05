import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * testfile
 * @author QIN SIJIA
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/learnjava/a.txt");
        System.out.println(f);
        f.renameTo(new File("D:/learnjava/bb.txt"));
        System.out.println(System.getProperty("user.dir"));

        /*File f2 = new File("gg.txt");
        f2.createNewFile();

        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(new Date(f2.lastModified()));
        System.out.println(f2.length());
        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());*/

        File f3 = new File("user.dir/1/2/3");
        boolean flag = f3.mkdirs();
        System.out.println(flag);


    }
}
