package _5IO._2IO;

import java.io.*;

public class _6BufferedOutputStream {
    public static void main(String[] args)throws IOException {
        //FileInputStream fileInputStream = new FileInputStream("src\\_5IO\\_2IO\\_5_IMG_20200103_111355.jpg");
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\_5IO\\_2IO\\_5_IMG_20200103_111355.jpg"));

        //      FileOutputStream fileOutputStream = new FileOutputStream("src\\_5IO\\_2IO\\_5_IMG_copy.jpg");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(new FileOutputStream("src\\_5IO\\_2IO\\_5_IMG_copy.jpg"));


      //  bufferedOutputStream.flush();
       // bufferedInputStream.
        byte[] bys = new byte[1024];
        int len;

        while ((len = bufferedInputStream.read(bys)) != -1) {

             bufferedOutputStream.write(bys, 0, len);

            //     System.out.println(new String(bys, 0, len));
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();

        //if not flush  the file will less 3kb  capacity
       //bufferedOutputStream.flush();
        //fileOutputStream.close();
        //fileInputStream.close();
    }
}
