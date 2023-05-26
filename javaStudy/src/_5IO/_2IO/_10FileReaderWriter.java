package _5IO._2IO;

import java.io.*;

public class _10FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src\\_5IO\\_2IO\\_9CharacterStream.java");
        FileWriter fileWriter = new FileWriter("src\\_5IO\\_2IO\\_10Copy.txt");
        char[] chs = new char[1024];
        int len;
        while ((len=fileReader.read(chs))!=-1){

            fileWriter.write(chs,0,len);
        }
        /*
        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }


        * */
        fileReader.close();
        fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\_5IO\\_2IO\\_10Copy.txt"));
        int ch;
        while ((ch=bufferedReader.read())!=-1){
            System.out.print((char)ch);
        }
        bufferedReader.close();
    }
}
