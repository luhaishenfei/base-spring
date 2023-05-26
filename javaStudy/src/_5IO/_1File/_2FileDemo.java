package _5IO._1File;

import java.io.File;
import java.io.IOException;

public class _2FileDemo
{
    public static void main(String[] args) throws IOException {
        File f = new File("src\\_5IO\\_1File\\_2FileDemo.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("---");
        System.out.println(f.delete());
        System.out.println(f.exists());
        System.out.println("----delete hole dir that have files");
        File file2 = new File("_5FileTestDir");
        System.out.println(file2.getAbsolutePath());
        file2.mkdir();

        File file3 = new File(file2,"\\FileTest.txt");
        file3.createNewFile();
        System.out.println(file3.exists());

        System.out.println("delete hole dir "+file2.delete());

        File file4 = new File(file2,"\\FileTest4.txt");
        file4.createNewFile();
        File file5 = new File(file2,"\\FileTest5.txt");
        file5.createNewFile();
        int count=0;
        for (File file :    file2.listFiles()
                ) {
            System.out.println("delete"+count+"-"+file.getName()+"-"+file.delete());
            count++;
        }
        System.out.println("delete hole dir "+file2.delete());

    }
}
