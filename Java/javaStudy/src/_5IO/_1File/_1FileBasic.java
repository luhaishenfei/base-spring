package _5IO._1File;

import java.io.File;
import java.io.IOException;

public class _1FileBasic {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\zhw\\helloWorld.txt");
        System.out.println(file);
        System.out.println(file.exists());

        File file2 = new File("E:\\zhw","helloWorld.txt");
        System.out.println(file2);
        System.out.println(file2.exists());

        File fileTitle = new File("E:\\zhw");
        File file3 = new File(fileTitle,"helloWorld.txt");
        System.out.println(file3);
        System.out.println(file3.exists());

        File file4 = new File("E:\\zhw\\FileTest.txt");
        System.out.println("createNewFile"+file4.createNewFile());
        //file.delete();

        File file5 = new File("E:\\zhw\\FileTest");
        System.out.println("mkdir"+file5.mkdir());

        File file6 = new File("E:\\xl\\FileTest");
        System.out.println("mkdirs"+file6.mkdirs());

        //Create a dir name like xxxx.txt
        File file7 = new File("E:\\zhw\\helloWorl1111d.txt");
        System.out.println("mkdirsWithDotTXT"+"--"+file7.mkdirs());

        for (String s :
                fileTitle.list()) {
            System.out.println(s);
        }
    }
}
