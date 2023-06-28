package _5IO._2IO;

import java.io.*;

public class _11BufferNewLineAndReadLine {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src\\_5IO\\_2IO\\_11Test.txt")
        );
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello"+i);
            //    \r\t为windows换行符  为兼容性使用newline
            //   bufferedWriter.write("\r\t");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src\\_5IO\\_2IO\\_11Test.txt")
        );
        String line;
        while ((line=bufferedReader.readLine())!=null) {
           //readLine 不包含换行符
            // System.out.print(line);
            System.out.println(line);

        }
        bufferedReader.close();
    }
}
