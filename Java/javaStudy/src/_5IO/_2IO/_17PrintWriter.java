package _5IO._2IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class _17PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {

//        PrintWriter(String fileName)
//        PrintWriter(Writer out,boolean autoFlush)

        PrintWriter printWriter = new PrintWriter("src\\_5IO\\_2IO\\_17Test.txt");
        printWriter.write("hello");
        printWriter.flush();

        //自动刷新
        PrintWriter pr = new PrintWriter(printWriter,true);
        pr.write("world");
        pr.println();
        pr.close();
    }
}
