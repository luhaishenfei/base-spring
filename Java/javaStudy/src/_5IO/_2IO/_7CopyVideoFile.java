package _5IO._2IO;

import java.io.*;

public class _7CopyVideoFile {
    public static void main(String[] args)throws IOException {
        long startTime= System.currentTimeMillis();
        copy();
        long endTime= System.currentTimeMillis();
        System.out.println("Takes "+(endTime-startTime)+"miles");




    }

    public static void copy()throws  IOException{
        String s = "src\\_5IO\\_2IO\\_7_VID_20190621_121758.mp4";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(s));

        BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(new FileOutputStream("src\\_5IO\\_2IO\\_7_VID_copy.mp4"));

        byte[] bys = new byte[1024];
        int len;

        while ((len = bufferedInputStream.read(bys)) != -1) {

            bufferedOutputStream.write(bys, 0, len);

        }
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }

}
