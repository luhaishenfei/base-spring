package _5IO._2IO;

import java.io.*;

public class _9CharacterStream {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("src\\_5IO\\_2IO\\_5_IMG_20200103_111355.jpg");
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    new FileOutputStream("src\\_5IO\\_2IO\\_9TestTxt.txt"),"UTF-8"
            );
            outputStreamWriter.write("中=国");
            outputStreamWriter.flush();
            outputStreamWriter.write(97);
        outputStreamWriter.flush();
        char[] chs={'a','b','c','d','e',};
        outputStreamWriter.write(chs);
        outputStreamWriter.write(chs,1,chs.length-1);
        String s = "zxyopq";
        outputStreamWriter.write(s,1,s.length()-1);
           outputStreamWriter.close();

        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("src\\_5IO\\_2IO\\_9TestTxt.txt")
        );
        //method NO.1
//        int ch;
//        while ((ch=inputStreamReader.read())!=-1){
//            System.out.print((char) ch);
//        }

        char[] chss = new char[1024];
        int len;
        while ((len=inputStreamReader.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        inputStreamReader.close();

        }
    }
