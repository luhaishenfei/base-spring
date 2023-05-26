package _5IO._2IO;

import java.io.*;

//如果遇到编码问题  还是使用InputStreamReader 和OutputStreamWriter
public class _12BufferCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src\\_5IO\\_2IO\\_11Test.txt")
        );
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src\\_5IO\\_2IO\\_12CopyTest.txt")
        );
        String line;

        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            //不使用newLine 将导致复制的文本都在一行
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
